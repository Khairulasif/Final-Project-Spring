package com.example.FinalProject.service;

import com.example.FinalProject.empdto.AbsentDto;
import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.entity.Absent;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.repository.AbsentRepo;
import com.example.FinalProject.repository.AttendanceGetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AbsentService {

    @Autowired
    AbsentRepo absentRepo;


    @Autowired
    AttendanceGetRepo attendanceGetRepo;
//    LocalDate currentDate = LocalDate.now(Clock.systemDefaultZone()) ;

    public void absentEmpSave(List<AbsentDto> absentDtos) {

        List<AbsentDto> absentEmps = absentDtos;

        for (AbsentDto emp: absentEmps ) {

            absentRepo.save(emp);
        }




}

    @Scheduled(cron = "0 54 16 * * ?")
    public void insertAbsent(){
        System.out.println("------------------------");
        List<AttendanceGetDto> absentEmp = attendanceGetRepo.findAbsent();


        for (AttendanceGetDto emp: absentEmp) {
            AbsentDto absentDto = new AbsentDto();
            absentDto.setDate(LocalDate.now());
            absentDto.setStatus("Absent");
            absentDto.setEmployeeId(emp.getEmployeeId());
            absentDto.setFname(emp.getFname());
            absentDto.setDepartment(emp.getDepartment());
            absentDto.setDesignation(emp.getDesignation());

            absentRepo.save(absentDto);

        }

    }

    public List<AbsentDto> getByDep(String department) {
        return absentRepo.findByDepartment(department);
    }

    public List<AbsentDto> getByDate(String date) {
        return absentRepo.findByDate(date);
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



