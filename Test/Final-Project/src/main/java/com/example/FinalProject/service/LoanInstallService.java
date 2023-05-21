package com.example.FinalProject.service;

import com.example.FinalProject.entity.LoanInstallEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.repository.LoanInstallRepo;
import com.example.FinalProject.repository.ProjectAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoanInstallService {

    @Autowired
    LoanInstallRepo loanInstallRepo;

    public void userSave(LoanInstallEntity loanInstallEntity) {

        loanInstallRepo.save(loanInstallEntity);

    }

    public List<LoanInstallEntity> userGet() {
        return loanInstallRepo.findAll();
    }


    public LoanInstallEntity userUpdate(Long id) {
        return loanInstallRepo.findById(id).orElse(new LoanInstallEntity());
    }

    public void userDelete(Long id) {
        loanInstallRepo.deleteById(id);
    }
}
