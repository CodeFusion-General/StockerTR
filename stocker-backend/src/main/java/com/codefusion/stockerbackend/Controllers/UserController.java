package com.codefusion.stockerbackend.Controllers;

import com.codefusion.stockerbackend.Dto.UserDto;
import com.codefusion.stockerbackend.Models.User;
import com.codefusion.stockerbackend.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/create")
    public Mono<User> createUser(@RequestBody UserDto userDto) {
        return service.createUser(userDto);

    }

}
