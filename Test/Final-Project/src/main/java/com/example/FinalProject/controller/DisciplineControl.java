package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddDepartmentDto;
import com.example.FinalProject.empdto.DisciplineDto;
import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.DisciplineEntity;
import com.example.FinalProject.service.AddDepartmentService;
import com.example.FinalProject.service.DisciplineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DisciplineControl {

    @Autowired
    DisciplineService disciplineService;

    @PostMapping("/disciplinepost")
    public void save(@RequestBody DisciplineDto disciplineDto) {

        if (disciplineDto != null) {
            DisciplineEntity disEntity2 = new DisciplineEntity();
            BeanUtils.copyProperties(disciplineDto, disEntity2);
            disciplineService.userSave(disEntity2);
        }

    }

    @PutMapping("/disciplinedit/{id}")
    public void update( @RequestBody DisciplineDto disciplineDto, @PathVariable("id") Long id ) {
        if (disciplineDto != null) {
            disciplineDto.setId(id);
            DisciplineEntity disEntity = new DisciplineEntity();
            BeanUtils.copyProperties(disciplineDto, disEntity);


            disciplineService.userSave(disEntity);
        }
    }


    @GetMapping("/disciplineget")
    List<DisciplineDto> get() {

        List<DisciplineEntity> department = disciplineService.userGet();
        List<DisciplineDto> dtos = new ArrayList<>();
        for (DisciplineEntity user: department) {
            DisciplineDto disDto = new DisciplineDto();
            BeanUtils.copyProperties(user, disDto);
            dtos.add(disDto);
        }

        return dtos;
    }

    @DeleteMapping("/disciplinedelete/{id}")
    public void delete(@PathVariable("id") Long id){

        disciplineService.userDelete(id);
    }



    @GetMapping("/disciplineget/{id}")
    public DisciplineDto edit(@PathVariable("id") Long id){
        DisciplineEntity dis;
        dis = disciplineService.userUpdate(id);
        if (dis.getId() != null) {
            DisciplineDto disDto = new DisciplineDto();
            BeanUtils.copyProperties(dis, disDto);
            return disDto;
        }
        return null;
    }
}
