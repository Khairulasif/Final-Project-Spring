package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.LoanInstallDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.empdto.ProjectListDto;
import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.LoanInstallEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.LoanInstallService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class LoanInstallControl {



    @Autowired
    LoanInstallService loanInstallService;
    @PostMapping("/loaninstallmentadd")
    public void save(@RequestBody LoanInstallDto loanInstallDto) {

        if (loanInstallDto != null) {
            LoanInstallEntity proEntity2 = new LoanInstallEntity();
            BeanUtils.copyProperties(loanInstallDto, proEntity2);
            loanInstallService.userSave(proEntity2);
        }

    }

    @GetMapping("/loaninstallmentlistget")
    List<LoanInstallDto> get() {

        List<LoanInstallEntity> users = loanInstallService.userGet();
        List<LoanInstallDto> dtos = new ArrayList<>();
        for (LoanInstallEntity user: users) {
            LoanInstallDto userDto = new LoanInstallDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

    @DeleteMapping("/loanistallmentdelete/{id}")
    public void delete(@PathVariable("id") Long id){

        loanInstallService.userDelete(id);
    }

    @GetMapping("/loaninstallmentlist/{id}")
    public LoanInstallEntity edit(@PathVariable("id") Long id){
        LoanInstallEntity user;
        user = loanInstallService.userUpdate(id);
        if (user.getId() != null) {
//            EmpDto userDto = new EmpDto();
//            BeanUtils.copyProperties(user, userDto);
            return user;
        }
        return null;
    }


    @PutMapping("/loaninstallmentlistedit/{id}")
    public void update(@RequestBody LoanInstallEntity loanInstallEntity, @PathVariable("id") Long id) {
        if (loanInstallEntity != null) {
            loanInstallEntity.setId(id);
            loanInstallService.userSave(loanInstallEntity);
        }
    }




}
