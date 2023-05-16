package com.example.FinalProject.service;

import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    public void userSave(EmpEntity empEntity) {

        empRepo.save(empEntity);

    }

    public List<EmpEntity> userGet() {
        return empRepo.findAll();
    }


    public EmpEntity userUpdate(Long id) {
        return empRepo.findById(id).orElse(new EmpEntity());
    }

    public void userDelete(Long id) {
        empRepo.deleteById(id);
    }
}
