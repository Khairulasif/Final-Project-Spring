package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.LoanAddDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.entity.LeaveAppEntity;
import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.LoanAddService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class LoanAddControl {

    @Autowired
    LoanAddService loanAddService;

    @PostMapping("/loanaddpost")
    public void save(@RequestBody LoanAddEntity loanAddEntity) {

        if (loanAddEntity != null) {
//            LeaveAppEntity proEntity2 = new LeaveAppEntity();
//            BeanUtils.copyProperties(projectAddDto, proEntity2);
            loanAddService.userSave(loanAddEntity);
        }

    }

    @GetMapping("/loanlistget")
    List<LoanAddDto> get() {

        List<LoanAddEntity> users = loanAddService.userGet();
        List<LoanAddDto> dtos = new ArrayList<>();
        for (LoanAddEntity user: users) {
            LoanAddDto userDto = new LoanAddDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

        @GetMapping("/loanlist/{id}")
    public LoanAddEntity edit(@PathVariable("id") Long id){
            LoanAddEntity user;
        user = loanAddService.userUpdate(id);
        if (user.getId() != null) {
//            EmpDto userDto = new EmpDto();
//            BeanUtils.copyProperties(user, userDto);
            return user;
        }
        return null;
    }

    @PutMapping("/loanedit/{id}")
    public void update(@RequestBody LoanAddEntity loanAddEntity, @PathVariable("id") Long id) {
        if (loanAddEntity != null) {
            loanAddEntity.setId(id);
            loanAddService.userSave(loanAddEntity);
        }
    }

    @DeleteMapping("/loandelete/{id}")
    public void delete(@PathVariable("id") Long id){

        loanAddService.userDelete(id);
    }
}
