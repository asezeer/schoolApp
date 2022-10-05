package com.schoolManagement.schoolApp.DataAccess;

import com.schoolManagement.schoolApp.Entities.School;
import com.schoolManagement.schoolApp.Entities.SchoolType;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateSchoolTypeDal implements ISchoolTypeDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateSchoolTypeDal(EntityManager entityManager){this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<SchoolType> getAll() {
        Session session= entityManager.unwrap(Session.class);
        List<SchoolType> schoolTypes = session.createQuery("from SchoolType",SchoolType.class).getResultList();
        return schoolTypes;
    }

    @Override
    public void add(SchoolType schoolType) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(schoolType);

    }

    @Override
    public void update(SchoolType schoolType) {
        Session session= entityManager.unwrap(Session.class);
        session.saveOrUpdate(schoolType);

    }

    @Override
    public void delete(SchoolType schoolType) {
        Session session= entityManager.unwrap(Session.class);
        SchoolType schoolTypeToDelete = session.get(SchoolType.class, schoolType.getId());
        session.delete(schoolTypeToDelete);

    }

    @Override
    public SchoolType getById(int id) {
        Session session= entityManager.unwrap(Session.class);
        SchoolType schoolType = session.get(SchoolType.class, id);
        return schoolType;
    }
}
