# Dockerfile
# Estágio 1: Build da aplicação
FROM gradle:8.6-jdk21 AS build

# Define o diretório de trabalho
WORKDIR /app

# Copia apenas os arquivos necessários para baixar dependências
COPY build.gradle settings.gradle gradlew ./
COPY gradle ./gradle
COPY module-*/build.gradle ./module-identity/
# Repita para cada módulo ou use um script

# Baixa as dependências (cache layer)
RUN gradle dependencies --no-daemon

# Copia o código fonte completo
COPY . .

# Build da aplicação (gera o JAR)
RUN gradle clean bootJar --no-daemon

# Estágio 2: Imagem final
FROM eclipse-temurin:21-jre-jammy

# Cria usuário não-root para segurança
RUN addgroup --system --gid 1001 appgroup && \
    adduser --system --uid 1001 --gid 1001 appuser

WORKDIR /app

# Copia o JAR do estágio de build
COPY --from=build --chown=appuser:appgroup /app/module-transaction/build/libs/*.jar app.jar
# Se tiver um módulo principal específico, ajuste o caminho acima

# Expõe a porta da aplicação
EXPOSE 8080

# Muda para usuário não-root
USER appuser

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=5s --retries=3 \
  CMD curl -f http://localhost:8080/actuator/health || exit 1

# Comando de entrada
ENTRYPOINT ["java", "-jar", "app.jar"]