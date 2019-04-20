package com.zh.fizzbuzz.business;

import com.zh.fizzbuzz.common.enumeration.FizzBuzzStratageEnum;
import com.zh.fizzbuzz.service.FizzBuzzService;
import com.zh.fizzbuzz.service.IntegerToStringService;
import com.zh.fizzbuzz.service.impl.IntegerToBuzzServiceImpl;
import com.zh.fizzbuzz.service.impl.IntegerToFizzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(value=1)
public class FizzBuzz implements CommandLineRunner {

    List<IntegerToStringService> integerToStringServiceList = new ArrayList<IntegerToStringService>();

    @Autowired
    private FizzBuzzService fizzBuzzService;

    @Autowired
    private IntegerToBuzzServiceImpl integerToBuzzService1;

    @Autowired
    private IntegerToFizzServiceImpl integerToFizzService;

    @Value("${business.value}")
    private Integer value;


    @Override
    public void run(String... args) throws Exception {

        integerToStringServiceList.add(integerToFizzService);
        integerToStringServiceList.add(integerToBuzzService1);

        System.out.println("Stage 1........................");
        for(int i=1; i<=value; i++) {
            String result = fizzBuzzService.output(i, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,1);
            System.out.println(result);
        }
        System.out.println();
        System.out.println("Stage 2........................");
        for(int i=1; i<=value; i++) {
            String result = fizzBuzzService.output(i, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,2);
            System.out.println(result);
        }
    }
}
