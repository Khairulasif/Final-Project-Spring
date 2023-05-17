package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddAdminRepo extends JpaRepository<AddAdminEntity, Long> {
}
