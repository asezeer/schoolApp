package com.schoolManagement.schoolApp.Business;

import com.schoolManagement.schoolApp.Entities.School;

import java.util.List;

public interface ISchoolService {

    List<School> getAll();
    void add(School school);
    void update(School school);
    void delete(School school);

    School getById(int id);
}
