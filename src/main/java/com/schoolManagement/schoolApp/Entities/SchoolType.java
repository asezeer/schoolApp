package com.schoolManagement.schoolApp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="schoolType")
@Data
public class SchoolType {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "typeName")
    private String name;
}
