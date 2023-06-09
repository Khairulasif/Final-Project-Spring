package com.example.FinalProject.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddDepartmentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long departmentId;
    private String name;
}
