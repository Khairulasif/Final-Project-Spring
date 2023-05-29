package com.example.FinalProject.service;

import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.entity.DeductionEntity;
import com.example.FinalProject.repository.AllowanceRepo;
import com.example.FinalProject.repository.DeductionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeductionService {

    @Autowired
    DeductionRepo deductionRepo;

    public void userSave(DeductionEntity deductionEntity) {

        deductionRepo.save(deductionEntity);

    }

    public List<DeductionEntity> userGet() {
        return deductionRepo.findAll();
    }


    public DeductionEntity userUpdate(Long id) {
        return deductionRepo.findById(id).orElse(new DeductionEntity());
    }

    public void userDelete(Long id) {
        deductionRepo.deleteById(id);
    }

    public DeductionEntity getDeductions(Long id, String selectedMonth) {
        return deductionRepo.findbyIdMonth(id, selectedMonth);
    }
}
