package com.example.RejisterLogin.entity;

import com.example.RejisterLogin.dto.User;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Data
@NoArgsConstructor

@Entity
@Table(name = "User")

public class Userentity extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false,unique = true,length = 45)
    private String email;
    @Column(nullable = false,length = 640)
    private String password;
    @Column(nullable = false,length = 20)
    private String firstname;
    @Column(nullable = false,length = 20)
    private String lastname;
}
