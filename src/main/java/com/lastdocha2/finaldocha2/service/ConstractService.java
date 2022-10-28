package com.lastdocha2.finaldocha2.service;


import com.lastdocha2.finaldocha2.dao.CarRgistDao;
import com.lastdocha2.finaldocha2.dto.ContractDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ConstractService {

    @Autowired
    CarRgistDao carRegistDao;

    public int carRegistService(ContractDTO contractDTO){

        int sign = carRegistDao.constractSave(contractDTO);
        System.out.println("서비스 시작");

        return sign;
    }

}
