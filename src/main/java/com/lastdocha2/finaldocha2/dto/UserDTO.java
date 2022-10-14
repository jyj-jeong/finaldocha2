package com.lastdocha2.finaldocha2.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class UserDTO {

    private int id;
    private String resultCode;
    private String userId;
    private String userPw;
    private String userName;
    private Date createDate;
    private Date updateDate;
}
