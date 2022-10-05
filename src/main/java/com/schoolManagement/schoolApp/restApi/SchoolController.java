package com.schoolManagement.schoolApp.restApi;

import com.schoolManagement.schoolApp.Business.ISchoolService;
import com.schoolManagement.schoolApp.Entities.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {
    private ISchoolService schoolService;

    @Autowired
    public SchoolController(ISchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/schools")
    public List<School> get(){
        return schoolService.getAll();
    }

    @PostMapping("/school-add")
    public void add(@RequestBody School school){
        schoolService.add(school);
    }

    @PostMapping("/school-update")
    public void update(@RequestBody School school){
        schoolService.update(school);
    }

    @PostMapping("/school-delete")
    public void delete(@RequestBody School school){
        schoolService.delete(school);
    }

    @GetMapping("/schools/{id}")
    public School getById(@PathVariable int id){
        return schoolService.getById(id);
    }



}
