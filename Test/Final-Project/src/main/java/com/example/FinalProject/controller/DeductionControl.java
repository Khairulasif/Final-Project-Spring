package com.example.FinalProject.controller;

import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.entity.DeductionEntity;
import com.example.FinalProject.service.AllowanceService;
import com.example.FinalProject.service.DeductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DeductionControl {

    @Autowired
    DeductionService deductionService;

    @PostMapping("/deductionPost")
    public void save(@RequestBody DeductionEntity deductionEntity) {


        deductionService.userSave(deductionEntity);


    }

    @GetMapping("/deductions")
    public DeductionEntity getDeductions(@RequestParam("id") Long id, @RequestParam("selectedMonth") String selectedMonth) {



        DeductionEntity deductions = deductionService.getDeductions(id, selectedMonth);
        return deductions;
    }
}
