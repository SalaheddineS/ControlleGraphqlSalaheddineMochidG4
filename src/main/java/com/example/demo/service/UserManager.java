package com.example.demo.service;

import com.example.demo.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface UserManager  {
    public UserDTO getUserByEmail(String email);
    public List<UserDTO> getUserByDate(String date);
    public UserDTO saveUser(User user);
    public UserDTO deleteUser(long id);
}
