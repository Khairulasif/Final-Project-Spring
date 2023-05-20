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
public class LoanAddEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private Integer loanAmount;
    private LocalDate approveDate;
    private Integer installmentPeriod;
    private Integer installmentAmount;
    private Integer loanNo;
    private String status;
    private String loanDetail;

}
