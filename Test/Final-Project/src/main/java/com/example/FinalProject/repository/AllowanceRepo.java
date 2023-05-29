package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.entity.AllowanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceRepo extends JpaRepository<AllowanceEntity, Long> {

}
