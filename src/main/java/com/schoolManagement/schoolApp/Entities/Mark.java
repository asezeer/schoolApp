package com.schoolManagement.schoolApp.Entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="mark")
@Data
public class Mark {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "markValue")
    Long markValue;
}


