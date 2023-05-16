package com.example.FinalProject.controller;


import com.example.FinalProject.empdto.AddDepartmentDto;
import com.example.FinalProject.empdto.EmpDto;
import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.service.AddDepartmentService;
import com.example.FinalProject.service.EmpService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AddDepartmentControl {

    @Autowired
    AddDepartmentService addDepartmentService;

    @PostMapping("/departmentpost")
    public void save(@RequestBody AddDepartmentDto addDepDto) {

        if (addDepDto != null) {
            AddDepartmentEntity depEntity2 = new AddDepartmentEntity();
            BeanUtils.copyProperties(addDepDto, depEntity2);
            addDepartmentService.userSave(depEntity2);
        }

    }

    @PutMapping("/departmentedit/{id}")
    public void update( @RequestBody AddDepartmentDto addDepDto, @PathVariable("id") Long id ) {
        if (addDepDto != null) {
            addDepDto.setId(id);
            AddDepartmentEntity depEntity = new AddDepartmentEntity();
            BeanUtils.copyProperties(addDepDto, depEntity);


            addDepartmentService.userSave(depEntity);
        }
    }


    @GetMapping("/departmentget")
    List<AddDepartmentDto> get() {

        List<AddDepartmentEntity> department = addDepartmentService.userGet();
        List<AddDepartmentDto> dtos = new ArrayList<>();
        for (AddDepartmentEntity user: department) {
            AddDepartmentDto depDto = new AddDepartmentDto();
            BeanUtils.copyProperties(user, depDto);
            dtos.add(depDto);
        }

        return dtos;
    }

    @DeleteMapping("/departmendelete/{id}")
    public void delete(@PathVariable("id") Long id){

        addDepartmentService.userDelete(id);
    }



    @GetMapping("/departmentget/{id}")
    public AddDepartmentDto edit(@PathVariable("id") Long id){
        AddDepartmentEntity dep;
        dep = addDepartmentService.userUpdate(id);
        if (dep.getId() != null) {
            AddDepartmentDto depDto = new AddDepartmentDto();
            BeanUtils.copyProperties(dep, depDto);
            return depDto;
        }
        return null;
    }
}
