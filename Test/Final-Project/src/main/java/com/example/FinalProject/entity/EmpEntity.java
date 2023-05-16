package com.example.FinalProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmpEntity extends EmpBaseEntity{



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
//    private String image;
}
