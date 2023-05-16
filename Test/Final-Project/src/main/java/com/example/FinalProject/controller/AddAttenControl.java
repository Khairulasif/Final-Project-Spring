package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddAttenDto;
import com.example.FinalProject.empdto.BankInfAddDto;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.entity.BankInfAddEntity;
import com.example.FinalProject.service.AddAttenService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AddAttenControl {

    @Autowired
    AddAttenService addAttenService;


    @PostMapping("/addattenpost")
    public void save(@RequestBody AddAttenDto addAttenDto) {

        if (addAttenDto != null) {
            AddAttenEntity empEntity2 = new AddAttenEntity();
            BeanUtils.copyProperties(addAttenDto, empEntity2);
            addAttenService.userSave(empEntity2);
        }

    }

//    @GetMapping("/attendancelistget/{id}")
//    public AttendanceListEntity edit(@PathVariable("id") Long id){
//        AttendanceListEntity user;
//
//        user = attendanceListService.userUpdate(id);
//        if (user.getId() != null) {
////            ProjectListDto userDto = new ProjectListDto();
////            BeanUtils.copyProperties(user, userDto);
////            user.getBudget()-user.getSpent();
//            return user;
//        }
//        return null;
//    }


    @GetMapping("/addattenlistget")
    List<AddAttenDto> get() {

        List<AddAttenEntity> users = addAttenService.userGet();
        List<AddAttenDto> dtos = new ArrayList<>();
        for (AddAttenEntity user: users) {
            AddAttenDto userDto = new AddAttenDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }
}
