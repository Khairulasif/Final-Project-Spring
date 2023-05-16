package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.HolidayListDto;
import com.example.FinalProject.empdto.ProjectAddDto;
import com.example.FinalProject.empdto.ProjectListDto;
import com.example.FinalProject.entity.HolidayListEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.service.HolidayListService;
import com.example.FinalProject.service.ProjectAddService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class HolidayListControl {


    @Autowired
    HolidayListService holidayListService;
    @GetMapping("/holidaylistget")
    List<HolidayListDto> get() {

        List<HolidayListEntity> users = holidayListService.userGet();
        List<HolidayListDto> dtos = new ArrayList<>();
        for (HolidayListEntity user: users) {
            HolidayListDto userDto = new HolidayListDto();
            BeanUtils.copyProperties(user, userDto);
            dtos.add(userDto);
        }

        return dtos;
    }

    @PostMapping("/holidayaddpost")
    public void save(@RequestBody HolidayListDto holidayListDto) {

        if (holidayListDto != null) {
            HolidayListEntity proEntity2 = new HolidayListEntity();
            BeanUtils.copyProperties(holidayListDto, proEntity2);
            holidayListService.userSave(proEntity2);
        }

    }


    @GetMapping("/holidaylistget/{id}")
    public HolidayListEntity edit(@PathVariable("id") Long id){
        HolidayListEntity user;

        user = holidayListService.userUpdate(id);
        if (user.getId() != null) {
//            ProjectListDto userDto = new ProjectListDto();
//            BeanUtils.copyProperties(user, userDto);
//            user.getBudget()-user.getSpent();
            return user;
        }
        return null;
    }




        @DeleteMapping("/holidaylistdelete/{id}")
    public void delete(@PathVariable("id") Long id){

            holidayListService.userDelete(id);
    }
}
