package com.example.ztattom.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table
@Getter
@Setter
public class Tattoo {
    @Id
    @Column(name = "tattoo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dateWhen;
    private boolean taken;
    public Tattoo(){}
    public Tattoo(Long id) {this.id = id;}
    public Tattoo(String name) {this.name = name;}


}
