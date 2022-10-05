package com.schoolManagement.schoolApp.Business;

import com.schoolManagement.schoolApp.DataAccess.ISchoolTypeDal;
import com.schoolManagement.schoolApp.Entities.SchoolType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchoolTypeManager implements ISchoolTypeService{

    private ISchoolTypeDal schoolTypeDal;

    @Autowired
    public SchoolTypeManager (ISchoolTypeDal schoolTypeDal){this.schoolTypeDal = schoolTypeDal;}

    @Override
    @Transactional
    public List<SchoolType> getAll() {
        return this.schoolTypeDal.getAll();
    }

    @Override
    @Transactional
    public void add(SchoolType schoolType) {
        this.schoolTypeDal.add(schoolType);
    }

    @Override
    public void update(SchoolType schoolType) {
        this.schoolTypeDal.update(schoolType);

    }

    @Override
    public void delete(SchoolType schoolType) {
        this.schoolTypeDal.delete(schoolType);

    }

    @Override
    public SchoolType getById(int id) {
        return this.schoolTypeDal.getById(id);
    }
}
