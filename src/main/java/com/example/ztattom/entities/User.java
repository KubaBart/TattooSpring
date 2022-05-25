package com.example.ztattom.entities;

import com.example.ztattom.enums.accountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(nullable = false, unique = true, length = 38)
 private String email;
 @Column(nullable = false, unique = true, length = 64) // ze wzgledu na szyfrowanie
 private String password;
 @Column(nullable =false, length = 25)
 private String firstName;
 @Column(nullable = false, length = 25)
 private String lastName;
 @Enumerated(EnumType.STRING)
 @Column(name="accountType")
 private accountType accountType;

}
