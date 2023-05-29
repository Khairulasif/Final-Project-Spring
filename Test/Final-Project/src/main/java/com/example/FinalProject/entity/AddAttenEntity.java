package com.example.FinalProject.entity;

import com.example.FinalProject.empdto.ForTimeSerialize;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddAttenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Long empId;
    private String name;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")

    private LocalDate date;
//    @JsonDeserialize(using = ForTimeSerialize.class)
    private LocalTime signIn;
//    @JsonDeserialize(using = ForTimeSerialize.class)
    private LocalTime signOut;

    private String status;


    private String department;
    private String designation;
}
