package com.example.FinalProject.empdto;

import lombok.Data;

@Data
public class AddAdminDto {

    private Long id;
    private String name;
    private String email;

    private String userName;
    private String password;
    private String retypePassword;
}
