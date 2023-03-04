package com.junit.app.model;

import java.util.HashMap;

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
	
	//T(C)=O(N) AND s(c)=O(n)
		public static String nonRepeatingCharater(String s) {
			HashMap<Character, Integer> map = new HashMap<>();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (map.containsKey(c))
					map.put(c, map.get(c) + 1);
				else
					map.put(c, 1);
			}
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(map.get(ch)==1)
					return String.valueOf(ch);
			}
			return "$ OOPS!!!Non Repeating charter is not there!!!";
		}
}
