package com.example.FinalProject.service;

import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.repository.EmpRepo;
import com.example.FinalProject.repository.ProjectAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectAddService {

    @Autowired
    ProjectAddRepo projectAddRepo;

    public void userSave(ProjectAddEntity projectAddEntity) {

        projectAddRepo.save(projectAddEntity);

    }

    public List<ProjectAddEntity> userGet() {
        return projectAddRepo.findAll();
    }


    public ProjectAddEntity userUpdate(Long id) {
        return projectAddRepo.findById(id).orElse(new ProjectAddEntity());
    }

    public void userDelete(Long id) {
        projectAddRepo.deleteById(id);
    }
}
