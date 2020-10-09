package com.example.manager_user.util;

public class Common {
	public static boolean isNull(Object o) {
		return o != null ? true : false;
	}
	
	public static boolean isNullAndIsEmpty(String input) {
		return (isNull(input) && !input.isEmpty()) ? true : false;
	}
}
