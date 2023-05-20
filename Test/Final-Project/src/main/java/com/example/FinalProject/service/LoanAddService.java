package com.example.FinalProject.service;

import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.repository.LoanAddRepo;
import com.example.FinalProject.repository.ProjectAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanAddService {

    @Autowired
    LoanAddRepo loanAddRepo;

    public void userSave(LoanAddEntity loanAddEntity) {

        loanAddRepo.save(loanAddEntity);

    }

    public List<LoanAddEntity> userGet() {
        return loanAddRepo.findAll();
    }


    public LoanAddEntity userUpdate(Long id) {
        return loanAddRepo.findById(id).orElse(new LoanAddEntity());
    }

    public void userDelete(Long id) {
        loanAddRepo.deleteById(id);
    }
}
