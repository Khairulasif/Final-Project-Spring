package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.GenerateSalaryEntity;
import com.example.FinalProject.repository.EmpRepo;
import com.example.FinalProject.repository.GenerateSalaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenerateSalaryService {

    @Autowired
    GenerateSalaryRepo genSalaryRepo;

    public void userSave(GenerateSalaryEntity generateSalaryEntity) {

        genSalaryRepo.save(generateSalaryEntity);

    }

    public List<GenerateSalaryEntity> userGet() {
        return genSalaryRepo.findAll();
    }


    public GenerateSalaryEntity userUpdate(Long id) {
        return genSalaryRepo.findById(id).orElse(new GenerateSalaryEntity());
    }

    public void userDelete(Long id) {
        genSalaryRepo.deleteById(id);
    }

    public List<GenerateSalaryEntity> getPaidEmp() {
        return genSalaryRepo.findPaid();
    }
}
