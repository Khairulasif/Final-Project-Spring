package com.example.FinalProject.repository;

import com.example.FinalProject.entity.GenerateSalaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenerateSalaryRepo extends JpaRepository<GenerateSalaryEntity, Long> {
    @Query(value = "SELECT * FROM finalproject.generate_salary_entity WHERE status = 'Paid'", nativeQuery = true)
    List<GenerateSalaryEntity> findPaid();
}
