package com.example.FinalProject.empdto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AddAttenDto {


    private Long id;
    private String name;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate date;
    private LocalTime signIn;
    private LocalTime signOut;
    private LocalTime workingHour;
    private String status;


    private String department;
    private String designation;
}
