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
    Long salaryId;

    String month;
    BigDecimal basicSalary;

    BigDecimal bonus;
    BigDecimal allowance;
    BigDecimal deduction;
    BigDecimal loan;
    BigDecimal finalSalary;
    LocalDate payDate;
    String status;
    String paidType;

}
