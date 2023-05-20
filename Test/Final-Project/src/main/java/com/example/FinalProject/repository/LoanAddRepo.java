package com.example.FinalProject.repository;

import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanAddRepo extends JpaRepository<LoanAddEntity, Long> {


}
