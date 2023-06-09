package com.example.FinalProject.service;

import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.repository.AddAttenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  AddAttenService {

    @Autowired
    AddAttenRepo addAttenRepo;


    public void userSave(AddAttenEntity addAttenEntity) {

        addAttenRepo.save(addAttenEntity);

    }

    public List<AddAttenEntity> userGet() {
        return addAttenRepo.findAll();
    }


    public AddAttenEntity userUpdate(Long id) {
        return addAttenRepo.findById(id).orElse(new AddAttenEntity());
    }

    public void userDelete(Long id) {
        addAttenRepo.deleteById(id);
    }



    public List<AddAttenEntity> getByDep(String department) {
        return addAttenRepo.findByDepartment(department);
    }

    public List<AddAttenEntity> getByDate(String date) {
        return addAttenRepo.findByDate(date);
    }



}
