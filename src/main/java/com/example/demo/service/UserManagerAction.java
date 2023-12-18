package com.example.demo.service;

import com.example.demo.dao.entities.User;
import com.example.demo.dao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserManagerAction implements UserManager {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserMapper userMapper;

    public UserDTO getUserByEmail(String email){
        UserDTO dto = userMapper.mapToUserDTO(userRepository.findByEmail(email));
        return dto;

    }

    public List<UserDTO> getUserByDate(String date){
        List<User> users = userRepository.findByDate(date);
        List<UserDTO> dtos = new ArrayList<>();
        for(User user : users){
            dtos.add(userMapper.mapToUserDTO(user));
        }

        return dtos;
    }

    public UserDTO saveUser(User user){
        User user1 = userRepository.findByEmail(user.getEmail());
        if(user1 != null){
            throw new RuntimeException("User already exist");
        }
        user.setDate(new Date().toString());
        userMapper.mapToUserDTO(user);
        return userMapper.mapToUserDTO(user);
    }

    public UserDTO deleteUser(long id){
        User user1 = userRepository.findById(id).orElse(null);
        if(user1 == null){
            throw new RuntimeException("User doesn't exist");
        }
        userRepository.delete(user1);
        return userMapper.mapToUserDTO(user1);
    }


}
