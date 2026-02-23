package com.financial.authservice.client;


@FeignClient(name = "user-test", url = "${user.service.url}")
public interface UserClient {

    @GetMapping("/users/email/{email}")
    UserDTO findByEmail(@PathVariable String email);

}
