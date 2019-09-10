package com.mare.utils;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class RandomUtilsTest {
	
	@Test
	public void testGeneratorNumbericStr() {
		for (int i = 0; i < 5; i++) {
			String number = RandomUtils.generatorNumbericStr(5);
			System.out.println(number);
			Assert.assertThat(number.length(), Matchers.equalTo(5));
		}
	}
	
	@Test
	public void testGeneratorAlphaDigitStr() {
		for (int i = 0; i < 5; i++) {
			String number = RandomUtils.generatorAlphaDigitStr(8);
			System.out.println(number);
			Assert.assertThat(number.length(), Matchers.equalTo(8));
		}
	}
}
