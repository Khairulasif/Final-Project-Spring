package com.example.FinalProject.service;

import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.repository.AttendanceGetRepo;
import javafx.util.converter.LocalDateStringConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AttendanceGetService {

    @Autowired
    AttendanceGetRepo attendanceGetRepo;

    LocalDate currentDate = LocalDate.now(Clock.systemDefaultZone()) ;

//    public List<AttendanceGetDto> attenGet() {
//        return attendanceGetRepo.findAllAttendance();
//    }

    public List<AttendanceGetDto> attendanceGet() {
        return attendanceGetRepo.findAttendance();
    }

    public List<AttendanceGetDto> absentGet() {

        List<AttendanceGetDto> absentEmp = attendanceGetRepo.findAbsent();
        List<AttendanceGetDto> withDateAbsent = new ArrayList<>();
            for (AttendanceGetDto emp: absentEmp) {
                if (emp.getDate() == null) {
                    emp.setDate(this.currentDate);
                    emp.setStatus("Absent");
                    withDateAbsent.add(emp);

                }


            }
        return withDateAbsent;

    }

//    public void setCurrentDate() {
//        this.currentDate = LocalDate.now(Clock.systemDefaultZone()) ;
//
//    }
}
