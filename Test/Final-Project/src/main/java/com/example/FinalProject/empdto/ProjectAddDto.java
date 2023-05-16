package com.example.FinalProject.empdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ProjectAddDto {

    private Long id;
    private String name;
    private String description;
    private String status;
    private String company;
    private String leader;
    private Integer budget;
    private Integer spent;
    private Integer profit;
    private Integer duration;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate startDate;
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate endDate;
}
