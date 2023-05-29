package com.example.FinalProject.service;

import com.example.FinalProject.empdto.EmpDtoForSalary;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.repository.EmpGetForSalaryRepo;
import com.example.FinalProject.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo;
    @Autowired
    EmpGetForSalaryRepo empGetForSalaryRepo;

    public void userSave(EmpEntity empEntity) {

        empRepo.save(empEntity);
    }

    public List<EmpEntity> userGet() {
        return empRepo.findAll();
    }

    public EmpEntity empGetSelected(Long id) {
        return empRepo.findByselected(id);
    }


    public EmpEntity userUpdate(Long id) {
        return empRepo.findById(id).orElse(new EmpEntity());
    }

    public void userDelete(Long id) {
        empRepo.deleteById(id);
    }

    public List<EmpDtoForSalary> getEmpForSalary() {
        return empGetForSalaryRepo.findAllEmp();
    }
    public List<EmpDtoForSalary> getByDep(String department) {
        return empGetForSalaryRepo.findByDepartment(department);
    }
}
