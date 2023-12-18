package com.example.demo.dao.repositories;

import com.example.demo.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
    List<User> findByDate(String date);
}
