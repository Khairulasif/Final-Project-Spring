package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.LeaveAppDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.empdto.ProjectListDto;
import com.example.FinalProject.entity.EmpEntity;
import com.example.FinalProject.entity.LeaveAppEntity;
import com.example.FinalProject.entity.LoanAddEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.LeaveAppService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class LeaveAppControl {

    @Autowired
    LeaveAppService leaveAppService;

    @PostMapping("/leavepost")
    public void save(@RequestBody LeaveAppEntity leaveAppEntity) {

        if (leaveAppEntity != null) {
//            LeaveAppEntity proEntity2 = new LeaveAppEntity();
//            BeanUtils.copyProperties(projectAddDto, proEntity2);
            leaveAppService.userSave(leaveAppEntity);
        }

    }

    @GetMapping("/leaveapplylistget")
    List<LeaveAppDto> get() {

        List<LeaveAppEntity> users = leaveAppService.userGet();
        List<LeaveAppDto> dtos = new ArrayList<>();



        for (LeaveAppEntity user: users) {

//            if (user.getStatus() == null) {
//                user.setStatus("Pending");
//            }

            LeaveAppDto userDto = new LeaveAppDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);


        }

        return dtos;
    }

    @GetMapping("/editapprove/{id}")
    public LeaveAppEntity editApprove(@PathVariable("id") Long id){
        LeaveAppEntity user;
        user = leaveAppService.userUpdate(id);
        if (user.getId() != null) {
//            EmpDto userDto = new EmpDto();
//            BeanUtils.copyProperties(user, userDto);
            return user;
        }
        return null;
    }

    @GetMapping("/editreject/{id}")
    public LeaveAppEntity editReject(@PathVariable("id") Long id){
        LeaveAppEntity user;
        user = leaveAppService.userUpdate(id);
        if (user.getId() != null) {
//            EmpDto userDto = new EmpDto();
//            BeanUtils.copyProperties(user, userDto);
            return user;
        }
        return null;
    }

    @PutMapping("/approveedit/{id}")
    public void updateApprove(@RequestBody LeaveAppDto leaveAppDto, @PathVariable("id") Long id) {
        if (leaveAppDto != null) {
            leaveAppDto.setId(id);
            LeaveAppEntity empEntity = new LeaveAppEntity();
            BeanUtils.copyProperties(leaveAppDto, empEntity);
            leaveAppService.userSave(empEntity);
        }
    }

    @PutMapping("/rejectedit/{id}")
    public void updateReject(@RequestBody LeaveAppDto leaveAppDto, @PathVariable("id") Long id) {
        if (leaveAppDto != null) {
            leaveAppDto.setId(id);
            LeaveAppEntity empEntity = new LeaveAppEntity();
            BeanUtils.copyProperties(leaveAppDto, empEntity);
            leaveAppService.userSave(empEntity);
        }
    }
}
