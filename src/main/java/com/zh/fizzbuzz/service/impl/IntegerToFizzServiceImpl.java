package com.zh.fizzbuzz.service.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.zh.fizzbuzz.common.constant.Constant;
import com.zh.fizzbuzz.service.IntegerToStringService;

/**
 * IntegerToStringService implementation for FIZZ case.
 */
@Service
@Order(1)
public class IntegerToFizzServiceImpl implements IntegerToStringService {

	@Override
	public String transfer(int n) {
		return Constant.FIZZ;
	}

	@Override
	public boolean support(int n,int stage) {
		switch (stage) {
			case 1:
				return 0 == n % 3;
			case 2:
				return 0 == n % 3 || String.valueOf(n).contains("3");
			default:
				return Boolean.FALSE;
		}
	}

}
