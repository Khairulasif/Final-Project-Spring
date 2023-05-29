package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.repository.AddDepartmentRepo;
import com.example.FinalProject.repository.AllowanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllowanceService {

    @Autowired
    AllowanceRepo allowanceRepo;

    public void userSave(AllowanceEntity allowanceEntity) {

        allowanceRepo.save(allowanceEntity);

    }

    public List<AllowanceEntity> userGet() {
        return allowanceRepo.findAll();
    }


    public AllowanceEntity userUpdate(Long id) {
        return allowanceRepo.findById(id).orElse(new AllowanceEntity());
    }

    public void userDelete(Long id) {
        allowanceRepo.deleteById(id);
    }
}
