package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.entity.AllowanceEntity;
import com.example.FinalProject.entity.DeductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowanceRepo extends JpaRepository<AllowanceEntity, Long> {

    @Query(value = "SELECT * FROM finalproject.allowance_entity WHERE employee_id = :id AND month = :selectedMonth", nativeQuery = true )
    AllowanceEntity findbyIdMonthEmp(@Param("id") Long id, @Param("selectedMonth") String selectedMonth);
}
