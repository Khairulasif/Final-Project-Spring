package com.example.FinalProject.empdto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmpDto {
    private Long id;
    private String fname;
    private String lname;
    private String mobile;
    private String email;
    private String gender;
    private String department;
    private String designation;
    private String nationality;
    private Long nic;
    private String address;
    private LocalDate dateOfBirth;
    private LocalDate joiningDate;
    private Integer basicSalary;
}
