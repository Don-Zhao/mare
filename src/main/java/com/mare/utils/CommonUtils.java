package com.mare.utils;

public class CommonUtils {
	
	/**
	 * 判断一个字符串是否为null或者是空字符串
	 * @param str 待判断的字符串
	 * @return 字符串为null或者空，返回true，否则返回false
	 */
	public static boolean nullEmptyCheck(String str) {
		if (str == null || str.length() == 0) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * 判断两个对象是否相等
	 * @param obj1 待判断对象
	 * @param obj2 待判断对象
	 * @return 如果两个对象相等，则返回true，否则返回false
	 */
	public static boolean equal(Object obj1, Object obj2) {
		if (obj1 == null && obj2 == null) {
			return true;
		}
		
		if (obj1 == null || obj2 == null) {
			return false;
		}
		
		if (obj1.getClass() != obj2.getClass()) {
			return false;
		}
		
		return obj1.equals(obj2);
	}
}
