package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.repository.AddDepartmentRepo;
import com.example.FinalProject.repository.AddDesigRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddDesigService {

    @Autowired
    AddDesigRepo addDesigRepo;

    public void userSave(AddDesigEntity addDesigEntity) {

        addDesigRepo.save(addDesigEntity);

    }

    public List<AddDesigEntity> userGet() {
        return addDesigRepo.findAll();
    }


    public AddDesigEntity userUpdate(Long id) {
        return addDesigRepo.findById(id).orElse(new AddDesigEntity());
    }

    public void userDelete(Long id) {
        addDesigRepo.deleteById(id);
    }
}
