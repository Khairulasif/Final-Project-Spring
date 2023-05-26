package com.example.FinalProject.repository;

import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddAttenRepo extends JpaRepository<AddAttenEntity, Long> {

    @Query(value = "SELECT * FROM finalproject.add_atten_entity where department = :department ", nativeQuery = true)
    List<AddAttenEntity> findByDepartment(@Param("department") String department);

    @Query(value = "SELECT * FROM finalproject.add_atten_entity where date = :date ", nativeQuery = true)
    List<AddAttenEntity> findByDate(@Param("date") String date);
}
