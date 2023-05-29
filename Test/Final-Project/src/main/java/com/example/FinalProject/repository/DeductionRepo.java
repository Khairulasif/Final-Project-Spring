package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.entity.DeductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeductionRepo  extends JpaRepository<DeductionEntity, Long> {

    @Query(value = "SELECT * FROM finalproject.deduction_entity WHERE employee_id = :id AND month = :selectedMonth", nativeQuery = true )
    DeductionEntity findbyIdMonth(@Param("id") Long id, @Param("selectedMonth") String selectedMonth);
}
