package com.example.springfirst.repositories;

import com.example.springfirst.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
