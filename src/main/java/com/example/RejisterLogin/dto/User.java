package com.example.RejisterLogin.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private long id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
}
