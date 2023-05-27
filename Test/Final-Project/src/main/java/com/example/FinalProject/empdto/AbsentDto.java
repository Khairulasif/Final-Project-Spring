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
public class AbsentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String employeeId;
    String fname;
    LocalDate date;
    String empId;
    String name;
    String department;
    String designation;
    LocalTime signIn;
    LocalTime signOut;

    String status;

}
