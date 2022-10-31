package com.lastdocha2.finaldocha2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ContractDTO {

    //고객정보(제 1운전자)
    private String clientName1; //제1 고객명
    private String clientPhoneNum1; //제1 고객 연락처
    private String clientAddress1;//제1 고객 주소
    private String clientAddressDetail11;//제1 고객 주소 상세
    private String clientLisenseNum1; //제1 고객 면허번호
    //고객정보(제 2운전자)
    private String clientName2; //제2 고객명
    private String clientPhoneNum2; //제2 고객 연락처
    private String clientAddress2; //제2 고객 주소
    private String clientAddressDetail12; //제2 고객 주소 상세
    private String clientLisenseNum2; //제2 고객 면허번호
    //차량정보
    private String carNumber; //차량번호
    private String carClass; //차종
    private String oilClass; //유종
    private String carDistance; //주행거리
    private String carOption;  //옵션
    //대여정보
    private String rentalDate; //대여일
    private String rentalTime; //대여시간
    private String returnDate; //반납일
    private String returnTime; //반납시간
    private String rentalLocation;  //대여위치
    private String returnLocation;  //반납위치
    //탁송기사
    private String driverName;  //기사명
    private String driverPhone;  //기사연락처
    private String companyName;  //회사명

}
