package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.BankInfAddDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.empdto.ProjectListDto;
import com.example.FinalProject.entity.BankInfAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.BankInfAddService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class BankInfAddControl {

    @Autowired
    BankInfAddService bankInfAddService;

    @PostMapping("/bankinfaddpost")
    public void save(@RequestBody BankInfAddDto bankInfAddDto) {

        if (bankInfAddDto != null) {
            BankInfAddEntity proEntity2 = new BankInfAddEntity();
            BeanUtils.copyProperties(bankInfAddDto, proEntity2);
            bankInfAddService.userSave(proEntity2);
        }

    }

    @GetMapping("/bankinflistget")
    List<BankInfAddDto> get() {

        List<BankInfAddEntity> users = bankInfAddService.userGet();
        List<BankInfAddDto> dtos = new ArrayList<>();
        for (BankInfAddEntity user: users) {
            BankInfAddDto userDto = new BankInfAddDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

    @GetMapping("/bankinflistget/{id}")
    public BankInfAddDto edit(@PathVariable("id") Long id){
        BankInfAddEntity user;
        user = bankInfAddService.userUpdate(id);
        if (user.getId() != null) {
            BankInfAddDto userDto = new BankInfAddDto();
            BeanUtils.copyProperties(user, userDto);
            return userDto;
        }
        return null;
    }

    @PutMapping("/bankinfedit/{id}")
    public void update(@RequestBody BankInfAddEntity bankInfAddEntity, @PathVariable("id") Long id) {
        if (bankInfAddEntity != null) {
            bankInfAddEntity.setId(id);
            bankInfAddService.userSave(bankInfAddEntity);
        }
    }

    @DeleteMapping("/bankinfdelete/{id}")
    public void delete(@PathVariable("id") Long id){

        bankInfAddService.userDelete(id);
    }
}
