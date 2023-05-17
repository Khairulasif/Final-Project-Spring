package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddAdminDto;
import com.example.FinalProject.empdto.AddAttenDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.AddAdminService;
import com.example.FinalProject.service.AddAttenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AddAdminControl {


    @Autowired
    AddAdminService addAdminService;

    @PostMapping("/addadminpost")
    public void save(@RequestBody AddAdminDto addAdminDto) {

        if (addAdminDto != null) {
            AddAdminEntity empEntity2 = new AddAdminEntity();
            BeanUtils.copyProperties(addAdminDto, empEntity2);
            addAdminService.userSave(empEntity2);
        }

    }

    @GetMapping("/adminlistget")
    List<AddAdminDto> get() {

        List<AddAdminEntity> users = addAdminService.userGet();
        List<AddAdminDto> dtos = new ArrayList<>();
        for (AddAdminEntity user: users) {
            AddAdminDto userDto = new AddAdminDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }


    @GetMapping("/adminlistget/{id}")
    public AddAdminEntity edit(@PathVariable("id") Long id){
        AddAdminEntity user;

        user = addAdminService.userUpdate(id);
        if (user.getId() != null) {
//            ProjectListDto userDto = new ProjectListDto();
//            BeanUtils.copyProperties(user, userDto);
//            user.getBudget()-user.getSpent();
            return user;
        }
        return null;
    }

    @PutMapping("/adminlistedit/{id}")
    public void update(@RequestBody AddAdminDto addAdminDto, @PathVariable("id") Long id ) {
        if (addAdminDto != null) {
            addAdminDto.setId(id);
            AddAdminEntity projEntity = new AddAdminEntity();
            BeanUtils.copyProperties(addAdminDto, projEntity);


            addAdminService.userSave(projEntity);
        }
    }

    @DeleteMapping("/admindelete/{id}")
    public void delete(@PathVariable("id") Long id){

        addAdminService.userDelete(id);
    }

    @GetMapping("/admingetbyemail/{email}")
    public AddAdminEntity getUserByEmail(@PathVariable String email) {

        AddAdminEntity admins;
        admins = addAdminService.getUserByEmail(email);

        if (admins != null) {
            return admins;
        }
        return null;
    }
}
