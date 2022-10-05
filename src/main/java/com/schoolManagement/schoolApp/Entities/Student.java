package com.schoolManagement.schoolApp.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="student")
@Data
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "identityNumber")
    private int identityNumber;
    @Column(name = "name")
    private String name;
    @Column(name = "surName")
    private String surname;
    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "school_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private School school;
}
