package com.mare.utils;

import java.util.Random;

public class RandomUtils {
	
	public static String DIGIT = "0123456789";
	
	public static String ALPHA_DIGIT = "0123456789zbcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/**
	 * 生成一个长为length的纯数字字符串
	 * @param length 生成的字符串长度
	 * @return 生成的字符串
	 */
	public static String generatorNumbericStr(int length) {
		StringBuilder builder = new StringBuilder(length);
		Random random = new Random();
		int maxLength = DIGIT.length();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(maxLength);
			builder.append(DIGIT.charAt(number));
		}
		
		return builder.toString();
	}
	
	/**
	 * 生成一个长为length的字母和数字混合的字符串
	 * @param length 字符串的长度
	 * @return 生成的字符串
	 */
	public static String generatorAlphaDigitStr(int length) {
		StringBuilder builder = new StringBuilder();
		Random random = new Random();
		int maxLength = ALPHA_DIGIT.length();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(maxLength);
			builder.append(ALPHA_DIGIT.charAt(number));
		}
		
		return builder.toString();
	}
	
	
}
