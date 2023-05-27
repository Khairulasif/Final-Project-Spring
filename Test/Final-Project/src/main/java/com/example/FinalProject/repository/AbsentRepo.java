package com.example.FinalProject.repository;

import com.example.FinalProject.empdto.AbsentDto;
import com.example.FinalProject.entity.AddAttenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AbsentRepo extends JpaRepository<AbsentDto, Long> {

//    @Query(value = "SELECT e.employee_id, e.fname, e.department, e.designation, ae.date, ae.status FROM finalproject.emp_entity e\n" +
//            "left join finalproject.add_atten_entity ae\n" +
//           "on e.employee_id = ae.emp_id\n" +
//           "where ae.emp_id IS NULL\n", nativeQuery = true)
//    List<AbsentDto> findAbsent();

    @Query(value = "SELECT * FROM finalproject.absent_dto where department = :department ", nativeQuery = true)
    List<AbsentDto> findByDepartment(@Param("department") String department);

    @Query(value = "SELECT * FROM finalproject.absent_dto where date = :date ", nativeQuery = true)
    List<AbsentDto> findByDate(@Param("date") String date);


}
