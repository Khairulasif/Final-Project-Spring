package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddAdminEntity;
import com.example.FinalProject.entity.EmpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<EmpEntity, Long> {

    @Query(value = "SELECT * FROM emp_entity WHERE id = :id", nativeQuery = true)
    EmpEntity findByselected(@Param("id") Long id);


//    @Query(value = "SELECT * FROM add_admin_entity WHERE email = ?1", nativeQuery = true)
//    AddAdminEntity findByEmail(@Param("email") String email);
}
