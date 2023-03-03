package com.junit.app.model;

public class StringCodingQuestion {
	
	//T(C)=O(n)  and S(C)=O(n)
	public static boolean isRotated(String str1, String str2) {
		int n1 = str1.length();
		int n2 = str2.length();

		if (n1 != n2) {
			return false;
		}

		String concatenatedStr = str1 + str1;
		int index = concatenatedStr.indexOf(str2);

		return (index % n1 == 2 || index % n1 == n1 - 2);
	}
}
