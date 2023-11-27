package com.codefusion.stockerbackend.Services;

import com.codefusion.stockerbackend.Models.User;
import com.codefusion.stockerbackend.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;


    public Mono<User> createUser (User user){
        return repo.save(user);
    }

}
