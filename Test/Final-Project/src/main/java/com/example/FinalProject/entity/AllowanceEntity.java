package com.example.FinalProject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AllowanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String employeeId;
    private String employeeName;
    private String month;
    private Integer basicSalary;
    private Integer hra;
    private Integer ta;
    private Integer da;
    private Integer medicalAllowance;
    private Integer mobileAllowance;
    private Integer total;


}
