package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.service.AttendanceGetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AttendanceGetControl {

    @Autowired
    AttendanceGetService attendanceGetService;

//    @GetMapping("/atteendanceList")
//
//    List<AttendanceGetDto> getAttendance() {
//
//        List<AttendanceGetDto> users = attendanceGetService.attenGet();
//
//
//        return users;
//    }

    @GetMapping("/atteendanceList")

    List<AttendanceGetDto> getAttendance() {

        List<AttendanceGetDto> users = attendanceGetService.attendanceGet();


        return users;
    }

    @GetMapping("/absentList")

    List<AttendanceGetDto> getAbsent() {

        List<AttendanceGetDto> users = attendanceGetService.absentGet();


        return users;
    }
}
