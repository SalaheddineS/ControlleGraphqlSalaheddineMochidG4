package com.example.demo.service;

import com.example.demo.service.UserDTO;
import com.example.demo.dao.entities.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    ModelMapper modelMapper = new ModelMapper();
    public UserDTO mapToUserDTO(User user){
        return modelMapper.map(user, UserDTO.class);
    }

    public User mapToUser(UserDTO userDTO){
        return modelMapper.map(userDTO, User.class);
    }
}
