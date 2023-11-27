package com.codefusion.stockerbackend.Repositories;

import com.codefusion.stockerbackend.Models.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
}
