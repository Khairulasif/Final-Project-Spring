package com.example.FinalProject.empdto;

import lombok.Data;

@Data
public class BankInfAddDto {

    private Long id;
    private String bankName;
    private String accountName;
    private String accountNo;

    private String branch;
    private String method;
}
