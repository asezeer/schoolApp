package com.schoolManagement.schoolApp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="lesson")
@Data
public class Lesson {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "lessonName")
    String lesson_name;
}
