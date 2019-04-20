package com.zh.fizzbuzz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zh.fizzbuzz.common.enumeration.FizzBuzzStratageEnum;
import com.zh.fizzbuzz.common.exception.FizzBuzzException;
import com.zh.fizzbuzz.service.FizzBuzzService;
import com.zh.fizzbuzz.service.IntegerToStringService;

@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

	@Override
	public String output(int n, List<IntegerToStringService> integerToStringServiceList,
			FizzBuzzStratageEnum fizzBuzzStratage, int stage) {

		StringBuffer result = new StringBuffer();

		if (FizzBuzzStratageEnum.APPEND_ALL_ASC.getCode().equals(fizzBuzzStratage.getCode())) {
			for (IntegerToStringService calcService : integerToStringServiceList) {
				if (calcService.support(n,stage)) {
					result.append(calcService.transfer(n));
				}
			}

			if (0 == result.length()) {
				result.append(String.valueOf(n));
			}
		} else {
			throw new FizzBuzzException(
					String.format("Unsupported FizzBuzzStratageEnum(%s)", fizzBuzzStratage.getCode()));
		}

		return result.toString();
	}
}
