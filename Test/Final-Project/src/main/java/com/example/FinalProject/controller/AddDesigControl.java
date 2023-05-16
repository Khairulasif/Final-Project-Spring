package com.example.FinalProject.controller;

import com.example.FinalProject.empdto.AddDepartmentDto;
import com.example.FinalProject.empdto.AddDesigDto;
import com.example.FinalProject.entity.AddDepartmentEntity;
import com.example.FinalProject.entity.AddDesigEntity;
import com.example.FinalProject.service.AddDepartmentService;
import com.example.FinalProject.service.AddDesigService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class AddDesigControl {

    @Autowired
    AddDesigService addDesigService;

    @PostMapping("/designationpost")
    public void save(@RequestBody AddDesigDto addDesigDto) {

        if (addDesigDto != null) {
            AddDesigEntity desigEntity2 = new AddDesigEntity();
            BeanUtils.copyProperties(addDesigDto, desigEntity2);
            addDesigService.userSave(desigEntity2);
        }

    }

    @PutMapping("/designationedit/{id}")
    public void update( @RequestBody AddDesigDto addDesigDto, @PathVariable("id") Long id ) {
        if (addDesigDto != null) {
            addDesigDto.setId(id);
            AddDesigEntity desigEntity = new AddDesigEntity();
            BeanUtils.copyProperties(addDesigDto, desigEntity);


            addDesigService.userSave(desigEntity);
        }
    }

    @GetMapping("/designationget")
    List<AddDesigDto> get() {

        List<AddDesigEntity> desig = addDesigService.userGet();
        List<AddDesigDto> dtos = new ArrayList<>();
        for (AddDesigEntity user: desig) {
            AddDesigDto desigDto = new AddDesigDto();
            BeanUtils.copyProperties(user, desigDto);
            dtos.add(desigDto);
        }

        return dtos;
    }


    @DeleteMapping("/designationdelete/{id}")
    public void delete(@PathVariable("id") Long id){

        addDesigService.userDelete(id);
    }



    @GetMapping("/designationget/{id}")
    public AddDesigDto edit(@PathVariable("id") Long id){
        AddDesigEntity desig;
        desig = addDesigService.userUpdate(id);
        if (desig.getId() != null) {
            AddDesigDto desigDto = new AddDesigDto();
            BeanUtils.copyProperties(desig, desigDto);
            return desigDto;
        }
        return null;
    }
}
