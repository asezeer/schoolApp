package com.schoolManagement.schoolApp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="class")
@Data
public class Class {

    @Id
    @GeneratedValue
    Long id;
    String name;
    Long studentId;
}

