package com.example.FinalProject.empdto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class LeaveAppDto {

    private Long id;
    private String name;
    private String type;
    private LocalDate applyDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
//    private String description;

}
