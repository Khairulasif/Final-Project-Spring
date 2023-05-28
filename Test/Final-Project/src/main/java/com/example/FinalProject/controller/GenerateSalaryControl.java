package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.EmpDto;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.entity.GenerateSalaryEntity;
import com.example.FinalProject.service.EmpService;
import com.example.FinalProject.service.GenerateSalaryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class GenerateSalaryControl {

    @Autowired
    GenerateSalaryService genSalaryService;

    @PostMapping("/salaryAdd")
    public void save(@RequestBody GenerateSalaryEntity geSalaryEntity) {


            genSalaryService.userSave(geSalaryEntity);
        }

    }

