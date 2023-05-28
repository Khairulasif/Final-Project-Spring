package com.example.FinalProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GenerateSalaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long salaryId;
    Long employeeId;
    String fname;

    Integer basicSalary;
    String month;
    Integer bonus;
    Integer allowance;
    Integer deduction;
    Integer loan;
    Integer finalSalary;
    LocalDate payDate;
    String status;
    String paidType;

}
