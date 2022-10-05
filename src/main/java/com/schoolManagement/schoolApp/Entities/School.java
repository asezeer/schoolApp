package com.schoolManagement.schoolApp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name="School")
@Data
public class School {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "schoolName")
    private String schoolName;

    @Column(name = "schoolAddress")
    private String schoolAddress;

  //@Column(name = "SchoolTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "school_type_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private SchoolType schoolType;
}
