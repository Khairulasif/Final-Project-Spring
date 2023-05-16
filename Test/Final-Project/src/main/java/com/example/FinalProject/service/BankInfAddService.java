package com.example.FinalProject.service;

import com.example.FinalProject.entity.BankInfAddEntity;
import com.example.FinalProject.entity.LeaveAppEntity;
import com.example.FinalProject.repository.BankInfAddRepo;
import com.example.FinalProject.repository.LeaveAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankInfAddService {

    @Autowired
    BankInfAddRepo bankInfAddRepo;

    public void userSave(BankInfAddEntity bankInfAddEntity) {

        bankInfAddRepo.save(bankInfAddEntity);

    }

    public List<BankInfAddEntity> userGet() {
        return bankInfAddRepo.findAll();
    }


    public BankInfAddEntity userUpdate(Long id) {
        return bankInfAddRepo.findById(id).orElse(new BankInfAddEntity());
    }

    public void userDelete(Long id) {
        bankInfAddRepo.deleteById(id);
    }
}
