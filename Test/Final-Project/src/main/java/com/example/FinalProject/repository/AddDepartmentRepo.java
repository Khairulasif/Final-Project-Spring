package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.FinalProject.entity.AddDepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface AddDepartmentRepo extends JpaRepository <AddDepartmentEntity, Long>{

}
