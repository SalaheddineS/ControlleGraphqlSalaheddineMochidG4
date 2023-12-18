package com.example.demo.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "id_User")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id @GeneratedValue
    private long id;
    private String name;
    private String email;
    private String date;
    private String password;
}
