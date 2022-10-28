package com.lastdocha2.finaldocha2.dao;


import com.lastdocha2.finaldocha2.dto.ContractDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CarRgistDao {


    int constractSave(ContractDTO contractDTO);
}
