package com.example.FinalProject.empdto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class AddAttenDto implements Serializable {

    private static final Long serialVersionUID = 1L;


    private Long id;
    private Long empId;
    private String name;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private LocalDate date;
//    @JsonDeserialize(using = ForTimeSerialize.class)
//    @CreationTimestamp
    private LocalTime signIn;
//    @JsonDeserialize(using = ForTimeSerialize.class)
    private LocalTime signOut;
    private LocalTime workingHour;
    private String status;


    private String department;
    private String designation;
}
