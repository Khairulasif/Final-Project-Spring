package com.example.FinalProject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GenerateSalaryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employeeId;
    private String employeeName;
    private String month;
    private Integer basicSalary;

    private Integer bonus;
    private Integer allowance;
    private Integer deduction;

    private Integer finalSalary;
    private LocalDate payDate;
    private String status;
    private String paidType;

}
