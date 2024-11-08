package com.example.demo.dto;


import lombok.Data;

@Data
public class UserDto {

    private Integer id;
    private String userRole;  // "staff", "professor", "student" 등
    private String name;
    private String email;

    // Getter, Setter
}
