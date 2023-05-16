package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.entity.DisciplineEntity;

import com.example.FinalProject.repository.AddDepartmentRepo;
import com.example.FinalProject.repository.DisciplineRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplineService {
    @Autowired
    DisciplineRepo disciplineRepo;

    public void userSave(DisciplineEntity disciplineEntity) {

        disciplineRepo.save(disciplineEntity);

    }

    public List<DisciplineEntity> userGet() {
        return disciplineRepo.findAll();
    }


    public DisciplineEntity userUpdate(Long id) {
        return disciplineRepo.findById(id).orElse(new DisciplineEntity());
    }

    public void userDelete(Long id) {
        disciplineRepo.deleteById(id);
    }
}
