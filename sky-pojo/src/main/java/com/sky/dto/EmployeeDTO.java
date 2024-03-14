package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    //自增项可以去掉
//    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
