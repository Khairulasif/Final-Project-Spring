package com.example.FinalProject.repository;

import com.example.FinalProject.empdto.AttendanceGetDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceGetRepo extends JpaRepository<AttendanceGetDto, Long> {

        @Query(value = "SELECT e.employee_id, e.fname, ae.id, ae.emp_id, ae.name, ae.date, ae.sign_in, ae.sign_out, ae.department, ae.designation, ae.status FROM finalproject.emp_entity e\n" +
            "left join finalproject.add_atten_entity ae\n" +
            "on e.employee_id = ae.emp_id\n", nativeQuery = true)
             List<AttendanceGetDto> findAllAttendance();

    @Query(value = "SELECT e.employee_id, e.fname, ae.id, ae.emp_id, ae.name, ae.date, ae.sign_in, ae.sign_out, ae.department, ae.designation, ae.status FROM finalproject.emp_entity e\n" +
            "left join finalproject.add_atten_entity ae\n" +
            "on e.employee_id = ae.emp_id\n" +
            "where e.employee_id = ae.emp_id\n", nativeQuery = true)
    List<AttendanceGetDto> findAttendance();

    @Query(value = "SELECT e.employee_id, e.fname, ae.id, ae.emp_id, ae.name, ae.date, ae.sign_in, ae.sign_out, e.department, e.designation, ae.status FROM finalproject.emp_entity e\n" +
            "left join finalproject.add_atten_entity ae\n" +
            "on e.employee_id = ae.emp_id\n" +
            "where ae.emp_id IS NULL\n", nativeQuery = true)
    List<AttendanceGetDto> findAbsent();

}
