package com.example.FinalProject.repository;

import com.example.FinalProject.empdto.BankInfAddDto;
import com.example.FinalProject.entity.BankInfAddEntity;
import com.example.FinalProject.entity.DisciplineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInfAddRepo extends JpaRepository<BankInfAddEntity, Long> {
}
