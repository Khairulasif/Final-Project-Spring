package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddAdminRepo extends JpaRepository<AddAdminEntity, Long> {

    @Query(value = "SELECT * FROM add_admin_entity WHERE email = ?1", nativeQuery = true)
    AddAdminEntity findByEmail(@Param("email") String email);
}
