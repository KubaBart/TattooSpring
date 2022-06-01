package com.example.ztattom.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Role")
@Getter
@Setter
public class Role {
    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Role(){}
    public Role(String name) {this.name = name;}
    public Role(Long id){this.id = id;}

}
