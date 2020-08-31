package com.example.demo.userInterface;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * author:james
 * day:2020-08-31
 */
public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);
}
