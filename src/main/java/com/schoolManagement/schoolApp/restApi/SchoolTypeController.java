package com.schoolManagement.schoolApp.restApi;


import com.schoolManagement.schoolApp.Business.ISchoolTypeService;
import com.schoolManagement.schoolApp.Entities.School;
import com.schoolManagement.schoolApp.Entities.SchoolType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolTypeController {
    private ISchoolTypeService schoolTypeService;

    @Autowired
    public SchoolTypeController(ISchoolTypeService schoolTypeService){this.schoolTypeService = schoolTypeService;}

    @GetMapping("/school-types")
    public List<SchoolType> get(){
        return schoolTypeService.getAll();
    }

    @PostMapping("/school-type-add")
    public void add(@RequestBody SchoolType schoolType){
        schoolTypeService.add(schoolType);
    }

    @PostMapping("/school-type-update")
    public void update(@RequestBody SchoolType schoolType){
        schoolTypeService.update(schoolType);
    }

    @PostMapping("/school-type-delete")
    public void delete(@RequestBody SchoolType schoolType){
        schoolTypeService.delete(schoolType);
    }

    @GetMapping("/school-types/{id}")
    public SchoolType getById(@PathVariable int id){
        return schoolTypeService.getById(id);
    }

}
