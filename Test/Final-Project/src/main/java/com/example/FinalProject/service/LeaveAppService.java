package com.example.FinalProject.service;

import com.example.FinalProject.entity.LeaveAppEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.repository.LeaveAppRepo;
import com.example.FinalProject.repository.ProjectAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveAppService {

    @Autowired
    LeaveAppRepo leaveAppRepo;

    public void userSave(LeaveAppEntity leaveAppEntity) {

        leaveAppRepo.save(leaveAppEntity);

    }

    public List<LeaveAppEntity> userGet() {
        return leaveAppRepo.findAll();
    }


    public LeaveAppEntity userUpdate(Long id) {
        return leaveAppRepo.findById(id).orElse(new LeaveAppEntity());
    }

    public void userDelete(Long id) {
        leaveAppRepo.deleteById(id);
    }
}
