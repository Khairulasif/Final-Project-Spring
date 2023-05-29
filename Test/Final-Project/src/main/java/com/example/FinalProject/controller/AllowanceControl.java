package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddDesigDto;
import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.entity.DeductionEntity;
import com.example.FinalProject.service.AddDesigService;
import com.example.FinalProject.service.AllowanceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AllowanceControl {

    @Autowired
    AllowanceService allowanceService;

    @PostMapping("/allowancePost")
    public void save(@RequestBody AllowanceEntity allowanceEntity) {


        allowanceService.userSave(allowanceEntity);


    }

    @GetMapping("/allowances")
    public AllowanceEntity getAlowancesOfEmp(@RequestParam("id") Long id, @RequestParam("selectedMonth") String selectedMonth) {



        AllowanceEntity allowance = allowanceService.getAllowance(id, selectedMonth);
        return allowance;
    }


}
