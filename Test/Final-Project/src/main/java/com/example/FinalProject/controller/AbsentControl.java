package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AbsentDto;
import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.repository.AbsentRepo;
import com.example.FinalProject.service.AbsentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AbsentControl {

    @Autowired
    AbsentService absentService;





    @PostMapping("/absentEmpPost")
    public void saveAbsEmp(@RequestBody List<AbsentDto> absentEmp) {


        absentService.absentEmpSave(absentEmp);
    }

//    @GetMapping("/absentList")
//
//    List<AbsentDto> getAbsent() {
//
//        List<AbsentDto> users = absentService.absentGet();
//
//
//        return users;
//    }

    @GetMapping("/getByDepartmentAbsentEmp/{department}")
    public List<AbsentDto> getByDepartment(@PathVariable String department) {
        return absentService.getByDep(department);
    }

    @GetMapping("/getByDateAbsentEmp/{date}")
    public List<AbsentDto> getByDateAtt(@PathVariable String date) {
        return absentService.getByDate(date);
    }

}


