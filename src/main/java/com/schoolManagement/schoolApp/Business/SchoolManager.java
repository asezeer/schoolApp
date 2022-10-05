package com.schoolManagement.schoolApp.Business;

import com.schoolManagement.schoolApp.DataAccess.ISchoolDal;
import com.schoolManagement.schoolApp.Entities.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchoolManager implements ISchoolService{

    private ISchoolDal schoolDal;

    @Autowired
    public SchoolManager(ISchoolDal schoolDal) {
        this.schoolDal = schoolDal;
    }



    @Override
    @Transactional
    public List<School> getAll() {
        return this.schoolDal.getAll();
    }

    @Override
    @Transactional
    public void add(School school) {
        this.schoolDal.add(school);

    }

    @Override
    @Transactional
    public void update(School school) {
        this.schoolDal.update(school);

    }

    @Override
    @Transactional
    public void delete(School school) {
        this.schoolDal.delete(school);

    }

    @Override
    @Transactional
    public School getById(int id) {
        return this.schoolDal.getById(id);
    }
}
