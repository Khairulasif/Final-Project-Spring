package com.example.FinalProject.empdto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class HolidayListDto {

    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer days;
}
