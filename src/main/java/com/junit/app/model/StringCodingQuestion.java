package com.junit.app.model;

import java.math.BigInteger;
import java.util.HashMap;

public class StringCodingQuestion {

	// T(C)=O(n) and S(C)=O(n)
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

	// T(C)=O(N) AND s(c)=O(n)
	public static String nonRepeatingCharater(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.get(ch) == 1)
				return String.valueOf(ch);
		}
		return "$ OOPS!!!Non Repeating charter is not there!!!";
	}

	// T(c)= O(n1* n2) and S(C)=O(n1 + n2)
	public static String multiplyTwoString(String s1, String s2) {
		BigInteger big1 = new BigInteger(s1);
		BigInteger big2 = new BigInteger(s2);
		BigInteger mul = big1.multiply(big2);
		return String.valueOf(mul);
	}

	// T(c)= O(|s|*|x|) and S(C)=O(1)
	public static int strstr(String s, String x) {
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == x.charAt(0)) && (s.length() - i >= x.length())) {
				int check_length = 0;
				int k = i, j = 0;
				while (j < x.length()) {
					if (s.charAt(k) == x.charAt(j)) {
						check_length++;
					}
					j++;
					k++;
				}
				if (x.length() == check_length) {
					return i;
				}
			}
		}
		return -1;
	}

	// T(C)=O(n) and S(C)=O(n)
	public static int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	// T(C)=O(|S|) and S(C)=O(1) S is the length of the String
	public static int romanToDecimal(String s) {
		int num = 0, sum = 0, prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			switch (s.charAt(i)) {
			case 'I':
				num = 1;
				break;
			case 'V':
				num = 5;
				break;
			case 'X':
				num = 10;
				break;
			case 'L':
				num = 50;
				break;
			case 'C':
				num = 100;
				break;
			case 'D':
				num = 500;
				break;
			case 'M':
				num = 1000;
				break;
			}
			if (prev > num)
				sum -= num;
			else
				sum += num;
			prev = num;
		}
		return sum;
	}
}
