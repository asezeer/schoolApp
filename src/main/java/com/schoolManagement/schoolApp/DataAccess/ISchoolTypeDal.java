package com.schoolManagement.schoolApp.DataAccess;

import com.schoolManagement.schoolApp.Entities.SchoolType;

import java.util.List;

public interface ISchoolTypeDal {
    List<SchoolType> getAll();
    void add(SchoolType schoolType);
    void update(SchoolType schoolType);
    void delete(SchoolType schoolType);

    SchoolType getById(int id);
}
