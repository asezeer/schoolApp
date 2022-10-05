package com.schoolManagement.schoolApp.DataAccess;

import com.schoolManagement.schoolApp.Entities.School;

import java.util.List;

public interface ISchoolDal {
    List<School> getAll();
    void add(School school);
    void update(School school);
    void delete(School school);


    School getById(int id);
}
