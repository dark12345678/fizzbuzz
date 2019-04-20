package com.zh.fizzbuzz.service.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.zh.fizzbuzz.common.constant.Constant;
import com.zh.fizzbuzz.service.IntegerToStringService;

/**
 * IntegerToStringService implementation for BUZZ case.
 */
@Service
@Order(2)
public class IntegerToBuzzServiceImpl implements IntegerToStringService {

	@Override
	public String transfer(int n) {
		return Constant.BUZZ;
	}

	@Override
	public boolean support(int n, int stage) {

		switch (stage){
			case 1:
				return 0 == n%5;
			case 2:
				return 0 == n%5 || String.valueOf(n).contains("5");
			default:
				return Boolean.FALSE;
		}

	}

}
