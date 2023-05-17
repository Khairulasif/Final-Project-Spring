package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.repository.AddAdminRepo;
import com.example.FinalProject.repository.AddAttenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddAdminService {

    @Autowired
    AddAdminRepo addAdminRepo;

    public void userSave(AddAdminEntity addAdminEntity) {

        addAdminRepo.save(addAdminEntity);

    }

    public List<AddAdminEntity> userGet() {
        return addAdminRepo.findAll();
    }


    public AddAdminEntity userUpdate(Long id) {
        return addAdminRepo.findById(id).orElse(new AddAdminEntity());
    }

    public void userDelete(Long id) {
        addAdminRepo.deleteById(id);
    }

    public AddAdminEntity getUserByEmail(String email) {
        return addAdminRepo.findByEmail(email);
    }
}
