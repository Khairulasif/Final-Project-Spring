package com.example.FinalProject.service;

import com.example.FinalProject.entity.HolidayListEntity;
import com.example.FinalProject.entity.ProjectAddEntity;
import com.example.FinalProject.repository.HolidayListRepo;
import com.example.FinalProject.repository.ProjectAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HolidayListService {

    @Autowired
    HolidayListRepo holidayListRepo;

    public void userSave(HolidayListEntity holidayListEntity) {

        holidayListRepo.save(holidayListEntity);

    }

    public List<HolidayListEntity> userGet() {
        return holidayListRepo.findAll();
    }


    public HolidayListEntity userUpdate(Long id) {
        return holidayListRepo.findById(id).orElse(new HolidayListEntity());
    }

    public void userDelete(Long id) {
        holidayListRepo.deleteById(id);
    }
}
