package com.example.FinalProject.repository;

import com.example.FinalProject.empdto.EmpDtoForSalary;
import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpGetForSalaryRepo extends JpaRepository<EmpDtoForSalary, Long> {

    @Query(value = "SELECT employee_id, fname, department, designation, basic_salary FROM finalproject.emp_entity", nativeQuery = true)
    List<EmpDtoForSalary> findAllEmp();

    @Query(value = "SELECT * FROM finalproject.emp_entity where department = :department ", nativeQuery = true)
    List<EmpDtoForSalary> findByDepartment(@Param("department") String department);
}
