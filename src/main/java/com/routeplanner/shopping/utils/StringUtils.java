package com.routeplanner.shopping.utils;

public class StringUtils {

	public static boolean isBlank(String val) {
		return val == null || val.trim().length() == 0 ? true : false;
	}
	
	public static boolean isNotBlank(String val) {
		return !isBlank(val);
	}
}
