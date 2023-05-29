package com.example.FinalProject.empdto;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
@EntityScan
@Entity
public class AttendanceGetDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String fname;



    private Long id;
    private Long empId;
    private String name;
    private LocalDate date;

    private LocalTime signIn;
    private LocalTime signOut;


    private String department;
    private String designation;
    private String status;
}
