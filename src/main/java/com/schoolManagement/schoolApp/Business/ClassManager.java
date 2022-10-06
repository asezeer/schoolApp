package com.schoolManagement.schoolApp.Business;

import com.schoolManagement.schoolApp.DataAccessRepos.ClassRepository;
import com.schoolManagement.schoolApp.Entities.Class;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassManager {
    ClassRepository classRepository;

    public ClassManager(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public List<Class> getAllClasses() {
        return classRepository.findAll();
    }

    public Class saveOneClass(Class newClass) {
        return classRepository.save(newClass);
    }

    public Class getOneClass(Long classId) {
        return classRepository.findById(classId).orElse(null);
    }

    public Class updateOneClass(Long classId, Class newClass) {
        Optional<Class> classs = classRepository.findById(classId);
        if(classs.isPresent()){
            Class foundClass = classs.get();
            foundClass.setName(newClass.getName());
            classRepository.save(foundClass);
            return foundClass;
        }else return null;
    }
    public void deleteById(Long classId) {
        classRepository.deleteById(classId);
    }
}
