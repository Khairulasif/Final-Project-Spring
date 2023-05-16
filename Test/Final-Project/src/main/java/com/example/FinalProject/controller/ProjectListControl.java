package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.empdto.ProjectListDto;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class ProjectListControl {

    @Autowired
    ProjectAddService projectAddService;

    @GetMapping("/projectlistget")
    List<ProjectListDto> get() {

        List<ProjectAddEntity> users = projectAddService.userGet();
        List<ProjectListDto> dtos = new ArrayList<>();
        for (ProjectAddEntity user: users) {
            ProjectListDto userDto = new ProjectListDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

    @GetMapping("/projectlistget/{id}")
    public ProjectAddEntity edit(@PathVariable("id") Long id){
        ProjectAddEntity user;

        user = projectAddService.userUpdate(id);
        if (user.getId() != null) {
//            ProjectListDto userDto = new ProjectListDto();
//            BeanUtils.copyProperties(user, userDto);
//            user.getBudget()-user.getSpent();
            return user;
        }
        return null;
    }

    @PutMapping("/projectlistedit/{id}")
    public void update( @RequestBody ProjectAddDto projectAddDto, @PathVariable("id") Long id ) {
        if (projectAddDto != null) {
            projectAddDto.setId(id);
            ProjectAddEntity projEntity = new ProjectAddEntity();
            BeanUtils.copyProperties(projectAddDto, projEntity);


            projectAddService.userSave(projEntity);
        }
    }

    @DeleteMapping("/projectdelete/{id}")
    public void delete(@PathVariable("id") Long id){

        projectAddService.userDelete(id);
    }

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
