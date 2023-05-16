package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddAttenRepo extends JpaRepository<AddAttenEntity, Long> {
}
