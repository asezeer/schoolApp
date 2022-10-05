package com.schoolManagement.schoolApp.DataAccess;

import com.schoolManagement.schoolApp.Entities.School;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateSchoolDal implements ISchoolDal{

    private EntityManager entityManager;

    @Autowired
    public HibernateSchoolDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<School> getAll() {
        Session session= entityManager.unwrap(Session.class);
        List<School> schools = session.createQuery("from School",School.class).getResultList();
        return schools;
    }

    @Override
    public void add(School school) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(school);

    }

    @Override
    public void update(School school) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(school);

    }

    @Override
    public void delete(School school) {
        Session session= entityManager.unwrap(Session.class);
        School schoolToDelete = session.get(School.class, school.getId());
        session.delete(schoolToDelete);

    }

    @Override
    public School getById(int id) {
        Session session= entityManager.unwrap(Session.class);
        School school = session.get(School.class, id);
        return school;
    }
}
