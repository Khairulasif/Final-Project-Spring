package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.EmpDto;
import com.example.FinalProject.empdto.EmpDtoForSalary;
import com.example.FinalProject.entity.AddAttenEntity;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.service.EmpService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class EmpControl {

    @Autowired
    EmpService empService;

     @PostMapping("/emppost")
    public void save(@RequestBody EmpDto empDto) {

        if (empDto != null) {
            EmpEntity empEntity2 = new EmpEntity();
            BeanUtils.copyProperties(empDto, empEntity2);
            empService.userSave(empEntity2);
        }

    }



    @PutMapping("/empedit/{id}")
    public void update( @RequestBody EmpDto empDto, @PathVariable("id") Long id ) {
        if (empDto != null) {
            empDto.setEmployeeId(id);
            EmpEntity empEntity = new EmpEntity();
            BeanUtils.copyProperties(empDto, empEntity);


            empService.userSave(empEntity);
        }
    }

    @GetMapping("/empget")
    List<EmpDto> get() {

        List<EmpEntity> users = empService.userGet();
        List<EmpDto> dtos = new ArrayList<>();
        for (EmpEntity user: users) {
            EmpDto userDto = new EmpDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

    @DeleteMapping("/empdelete/{id}")
    public void delete(@PathVariable("id") Long id){

        empService.userDelete(id);
    }



    @GetMapping("/empget/{id}")
    public EmpDto edit(@PathVariable("id") Long id){
        EmpEntity user;
        user = empService.userUpdate(id);
        if (user.getEmployeeId() != null) {
            EmpDto userDto = new EmpDto();
            BeanUtils.copyProperties(user, userDto);
            return userDto;
        }
        return null;
    }

//    @GetMapping("/empgetforattendance")
//    List<EmpEntity> get2() {
//
//        List<EmpEntity> users = empService.empGetSelected();
////        List<EmpDto> dtos = new ArrayList<>();
////        for (EmpEntity user: users) {
////            EmpDto userDto = new EmpDto();
////            BeanUtils.copyProperties(user, userDto);
////            dtos.add(userDto);
////        }
//
//        return users;
//    }

    @GetMapping("/empgetforattendance/{id}")
    public EmpEntity editAtten(@PathVariable("id") Long id){
        EmpEntity user;
        user = empService.empGetSelected(id);
        List<EmpEntity> users = empService.userGet();




        return user;
    }


    @GetMapping("/empgetForSalary")
    List<EmpDtoForSalary> getEmpForSalary() {

        List<EmpDtoForSalary> users = empService.getEmpForSalary();



        return users;
    }

    @GetMapping("/getByDepartmentForSalary/{department}")
    public List<EmpDtoForSalary> getByDepartment(@PathVariable String department) {
        return empService.getByDep(department);
    }


    @GetMapping("/empGetByIdForSalary/{id}")
    public EmpDtoForSalary byIdForSalary(@PathVariable("id") Long id){
        EmpDtoForSalary user = empService.getByIdForSalary(id);


        return user;
    }




}
