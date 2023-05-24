package com.example.FinalProject.service;

import com.example.FinalProject.empdto.AttendanceGetDto;
import com.example.FinalProject.repository.AttendanceGetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceGetService {

    @Autowired
    AttendanceGetRepo attendanceGetRepo;

//    public List<AttendanceGetDto> attenGet() {
//        return attendanceGetRepo.findAllAttendance();
//    }

    public List<AttendanceGetDto> attendanceGet() {
        return attendanceGetRepo.findAttendance();
    }

    public List<AttendanceGetDto> absentGet() {
        return attendanceGetRepo.findAbsent();
    }
}
