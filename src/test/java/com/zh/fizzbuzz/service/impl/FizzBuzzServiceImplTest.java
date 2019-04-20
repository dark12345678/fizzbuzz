package com.zh.fizzbuzz.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zh.fizzbuzz.common.constant.Constant;
import com.zh.fizzbuzz.common.enumeration.FizzBuzzStratageEnum;
import com.zh.fizzbuzz.common.exception.FizzBuzzException;
import com.zh.fizzbuzz.service.FizzBuzzService;
import com.zh.fizzbuzz.service.IntegerToStringService;

public class FizzBuzzServiceImplTest extends BaseTests{

	@Autowired
	private FizzBuzzService fizzBuzzService;
	@Autowired
	private List<IntegerToStringService> integerToStringServiceList;

	@Test
	public void outputNumber() {
		int n = 1;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,stage);
		Assert.assertArrayEquals(new String[] {String.valueOf(n)}, new String[] {result});
	}
	
	@Test
	public void outputFizz() {
		int n = 3;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,stage);
		Assert.assertArrayEquals(new String[] {Constant.FIZZ}, new String[] {result});
	}
	
	@Test
	public void outputBuzz() {
		int n = 5;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,stage);
		Assert.assertArrayEquals(new String[] {Constant.BUZZ}, new String[] {result});
	}
	
	@Test
	public void outputFizzBuzz() {
		int n = 15;
		String expected = (Constant.FIZZ + Constant.BUZZ);
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_ASC,stage);
		Assert.assertArrayEquals(new String[] {expected}, new String[] {result});
	}
	
	@Test(expected=FizzBuzzException.class)
	public void outputException() {
		int n = 1;
		String result = fizzBuzzService.output(n, integerToStringServiceList, FizzBuzzStratageEnum.APPEND_ALL_DESC,stage);
		Assert.assertArrayEquals(new String[] {String.valueOf(n)}, new String[] {result});
	}
}
