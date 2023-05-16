package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.repository.AddDepartmentRepo;
import com.example.FinalProject.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddDepartmentService {

    @Autowired
    AddDepartmentRepo addDepartmentRepo;

    public void userSave(AddDepartmentEntity addDepartmentEntity) {

        addDepartmentRepo.save(addDepartmentEntity);

    }

    public List<AddDepartmentEntity> userGet() {
        return addDepartmentRepo.findAll();
    }


    public AddDepartmentEntity userUpdate(Long id) {
        return addDepartmentRepo.findById(id).orElse(new AddDepartmentEntity());
    }

    public void userDelete(Long id) {
        addDepartmentRepo.deleteById(id);
    }
}
