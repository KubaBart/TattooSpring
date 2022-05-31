package com.example.ztattom.entities;

import com.example.ztattom.enums.accountType;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
 private Long id;
 @Column(nullable = false, unique = true, length = 38)
 private String email;
 @Column(nullable = false, unique = true, length = 64) // ze wzgledu na szyfrowanie
 private String password;
 @Column(nullable =false, length = 25)
 private String firstName;
 @Column(nullable = false, length = 25)
 private String lastName;

 @ManyToMany
 @JoinTable(
  name = "users_roles",
          joinColumns = @JoinColumn(name = "user_id"),
          inverseJoinColumns = @JoinColumn(name = "role_id")
 )
 private Set <Role> roles = new HashSet<>();

 public void addRole(Role role)
 {
   this.roles.add(role);
 }
}
