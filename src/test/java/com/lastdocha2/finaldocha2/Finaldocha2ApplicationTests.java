package com.lastdocha2.finaldocha2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Finaldocha2ApplicationTests {

    @Test
    void contextLoads() {
    }
    public void solution(String[] babbling) {
        int answer = 0;
        int a = 0;
        babbling[0] = "aya";
        babbling[1] = "yee";
        babbling[2] = "u";
        babbling[3] = "maa";
        for(String babb : babbling){
            if(babb.contains("ayaaya")){
                answer --;
            }if(babb.contains("yeye")){
                answer --;
            }if(babb.contains("woowoo")){
                answer --;
            }if(babb.contains("mama")){
                answer --;
            }
            babb.replaceAll("aya","");
            babb.replaceAll("ye","");
            babb.replaceAll("woo","");
            babb.replaceAll("ma","");
            System.out.println(babb + "           나오는 값");
            if(babb.equals("")){
                a = 11;
                answer ++;
            }
        }
    }

}
