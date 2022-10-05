package com.schoolManagement.schoolApp.Business;

import com.schoolManagement.schoolApp.Entities.SchoolType;
import java.util.List;

public interface ISchoolTypeService {

    List<SchoolType> getAll();
    void add(SchoolType schoolType);
    void update(SchoolType schoolType);
    void delete(SchoolType schoolType);

    SchoolType getById(int id);
}




