package com.example.FinalProject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAddEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

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
//    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//
//    public Date getStartDate() {
//        return startDate;
//    }
//
//    public void setStartDate(String startDate)  {
//        System.out.println(startDate);
//        try{
//            this.startDate = ft.parse(startDate);
//
//        }catch (Exception e){}
//    }
//
//    public Date getEndDate() {
//        return endDate;
//    }
//
//    public void setEndDate(String endDate) throws ParseException {
//        System.out.println(endDate);
//        try{
//            this.endDate = ft.parse(endDate);;
//        }catch (Exception e){}
//    }
}
