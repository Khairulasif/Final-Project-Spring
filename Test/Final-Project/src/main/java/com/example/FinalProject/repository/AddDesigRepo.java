package com.example.FinalProject.repository;


import com.example.FinalProject.entity.AddDesigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddDesigRepo extends JpaRepository<AddDesigEntity, Long> {
}
