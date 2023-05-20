package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.entity.LeaveAppEntity;
import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.LoanAddService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
