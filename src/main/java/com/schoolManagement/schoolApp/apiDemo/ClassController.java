package com.schoolManagement.schoolApp.apiDemo;

import com.schoolManagement.schoolApp.Business.ClassManager;
import com.schoolManagement.schoolApp.DataAccessRepos.ClassRepository;
import com.schoolManagement.schoolApp.Entities.Class;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/classes")
public class ClassController {
    private ClassManager classManager;
    public ClassController(ClassManager classManager){
        this.classManager = classManager;
    }
    @GetMapping
    public List<Class> getAllClasses(){
        return classManager.getAllClasses();
    }
    @PostMapping
    public Class createClass(@RequestBody Class newClass){
        return classManager.saveOneClass(newClass);
    }

    @GetMapping("/{classId}")
    public Class getOneClass(@PathVariable Long classId){
        //custom exception
        return classManager.getOneClass(classId);
    }
    @PutMapping("{classId}")
    public Class updateOneClass(@PathVariable Long classId, @RequestBody Class newClass){
        return classManager.updateOneClass(classId,newClass);
    }
    @DeleteMapping("{classId}")
    public void deleteOneClass(@PathVariable Long classId){
        classManager.deleteById(classId);
    }


}
