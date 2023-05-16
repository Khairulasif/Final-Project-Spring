package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.EmpDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.EmpService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class ProjectAddControl {

    @Autowired
    ProjectAddService projectAddService;

    @PostMapping("/projectaddpost")
    public void save(@RequestBody ProjectAddDto projectAddDto) {

        if (projectAddDto != null) {
            ProjectAddEntity proEntity2 = new ProjectAddEntity();
            BeanUtils.copyProperties(projectAddDto, proEntity2);
            projectAddService.userSave(proEntity2);
        }

    }



//    @PutMapping("/projectaddedit/{id}")
//    public void update( @RequestBody ProjectAddDto projectAddDto, @PathVariable("id") Long id ) {
//        if (projectAddDto != null) {
//            projectAddDto.setId(id);
//            ProjectAddEntity projEntity = new ProjectAddEntity();
//            BeanUtils.copyProperties(projectAddDto, projEntity);
//
//
//            projectAddService.userSave(projEntity);
//        }
//    }

    @PutMapping("/projectaddedit/{id}")
    public void update(@RequestBody ProjectAddEntity projectAddEntity, @PathVariable("id") Long id) {
        if (projectAddEntity != null) {
            projectAddEntity.setId(id);
            projectAddService.userSave(projectAddEntity);
        }
    }

    @GetMapping("/projectaddget")
    List<ProjectAddDto> get() {

        List<ProjectAddEntity> users = projectAddService.userGet();
        List<ProjectAddDto> dtos = new ArrayList<>();
        for (ProjectAddEntity user: users) {
            ProjectAddDto userDto = new ProjectAddDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable("id") Long id){
//
//        empService.userDelete(id);
//    }



//    @GetMapping("/empget/{id}")
//    public EmpDto edit(@PathVariable("id") Long id){
//        EmpEntity user;
//        user = empService.userUpdate(id);
//        if (user.getId() != null) {
//            EmpDto userDto = new EmpDto();
//            BeanUtils.copyProperties(user, userDto);
//            return userDto;
//        }
//        return null;
//    }
}
