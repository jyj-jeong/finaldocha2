package com.lastdocha2.finaldocha2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContractDTO {


    private String clientName1; //제1 고객명
    private String clientPhoneNum1; //제1 고객 연락처
    private String clientLisenseNum1; //제1 고객 면허번호
    private String clientName2; //제2 고객명
    private String clientPhoneNum2; //제2 고객 연락처
    private String clientLisenseNum2; //제2 고객 면허번호
}
