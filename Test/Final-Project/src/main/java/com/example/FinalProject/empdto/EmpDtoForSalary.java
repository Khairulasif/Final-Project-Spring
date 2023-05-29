package com.example.FinalProject.empdto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class EmpDtoForSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long employeeId;
    private String fname;
    private String department;
    private String designation;
    private Integer basicSalary;

}
