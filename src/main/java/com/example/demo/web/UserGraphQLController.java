package com.example.demo.web;

import com.example.demo.service.UserDTO;
import com.example.demo.dao.entities.User;
import com.example.demo.service.UserManagerAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphQLController {
    @Autowired
    UserManagerAction userManagerAction;

    @QueryMapping
    public UserDTO getUserByEmail(@Argument String email){
        return userManagerAction.getUserByEmail(email);
    }

    @QueryMapping
    public List<UserDTO> getUserByDateNaissance(@Argument String date){
        return userManagerAction.getUserByDate(date);
    }
    @MutationMapping
    public UserDTO saveUser(@Argument User user){
        return userManagerAction.saveUser(user);
    }
    @MutationMapping
    public UserDTO deleteUser(@Argument long id){
        return userManagerAction.deleteUser(id);
    }
}
