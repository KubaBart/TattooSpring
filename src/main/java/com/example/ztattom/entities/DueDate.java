package com.example.ztattom.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class DueDate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateWhen;

    private boolean isTaken;

    private String description;

}
