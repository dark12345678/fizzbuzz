package com.zh.fizzbuzz;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.zh.fizzbuzz.service.impl.FizzBuzzServiceImplTest;
import com.zh.fizzbuzz.service.impl.IntegerToBuzzServiceImplTest;
import com.zh.fizzbuzz.service.impl.IntegerToFizzServiceImplTest;

@RunWith(Suite.class)
@SuiteClasses({
        IntegerToFizzServiceImplTest.class,
        IntegerToBuzzServiceImplTest.class,
        FizzBuzzServiceImplTest.class
})
public class FizzbuzzApplicationTests {

}
