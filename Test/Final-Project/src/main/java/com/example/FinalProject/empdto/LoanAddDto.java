package com.example.FinalProject.empdto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class LoanAddDto {

    private Long id;
    private String name;
    private Integer loanAmount;
    private Integer installmentAmount;
    private LocalDate approveDate;
    private Integer loanNo;
    private String status;
}
