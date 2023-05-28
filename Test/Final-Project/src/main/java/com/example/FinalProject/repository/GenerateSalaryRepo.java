package com.example.FinalProject.repository;

import com.example.FinalProject.entity.GenerateSalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerateSalaryRepo extends JpaRepository<GenerateSalaryEntity, Long> {
}
