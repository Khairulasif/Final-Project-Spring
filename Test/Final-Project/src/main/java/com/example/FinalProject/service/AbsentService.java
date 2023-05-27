package com.example.FinalProject.service;

import com.example.FinalProject.empdto.AbsentDto;
import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.repository.AbsentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AbsentService {

    @Autowired
    AbsentRepo absentRepo;

//    LocalDate currentDate = LocalDate.now(Clock.systemDefaultZone()) ;

    public void absentEmpSave(List<AbsentDto> absentDtos) {

//        absentRepo.save(absentDtos);
}



        }
//
//    public List<AbsentDto> absentGet() {
//
//        List<AbsentDto> absentEmp = absentRepo.findAbsent();
//        List<AbsentDto> withDateAbsent = new ArrayList<>();
//        for (AbsentDto emp: absentEmp) {
//            if (emp.getDate() == null) {
//                emp.setDate(this.currentDate);
//                emp.setStatus("Absent");
//                withDateAbsent.add(emp);
//
//            }
//
//
//        }
//        return withDateAbsent;
//
//    }
//
//    public void setCurrentDate() {
//        this.currentDate = LocalDate.now(Clock.systemDefaultZone()) ;
//
//    }



