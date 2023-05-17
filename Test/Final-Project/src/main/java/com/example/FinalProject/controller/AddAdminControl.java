package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddAdminDto;
import com.example.FinalProject.empdto.AddAttenDto;
import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.AddAttenEntity;
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
}
