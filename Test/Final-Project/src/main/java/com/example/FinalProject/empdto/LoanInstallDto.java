package com.example.FinalProject.empdto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class LoanInstallDto {

    private Long id;
    private String name;
    private Integer loanNo;
    private Integer installmentAmount;
    private LocalDate receiveDate;
    private String receiver;
    private Integer installmentNo;
    private String note;
}
