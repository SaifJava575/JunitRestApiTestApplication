package com.junit.app.model;

import java.util.Stack;

public class JunitFunctionDeclaration {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int longestCommonSubstr(String S1, String S2) {
		int n = S1.length(), m = S2.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int k = 0;
				while ((i + k) < n && (j + k) < m && S1.charAt(i + k) == S2.charAt(j + k))
					k = k + 1;
				ans = Math.max(ans, k);
			}
		}
		return ans;
	}
	
	public static boolean checkIp(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '.')
				count++;
			else if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		if (count != 3)
			return false;
		String[] arr = s.split("\\.");
		if (arr.length != 4)
			return false;
		for (String ele : arr) {
			if (ele == null || ele.equals(""))
				return false;
			if (0 > Integer.valueOf(ele) || Integer.valueOf(ele) > 255)
				return false;
			if (ele.length() > 1 && ele.charAt(0) == '0')
				return false;
		}
		return true;
	}
	
	public static String removeDuplicate(String s) {
		Stack<Character> st = new Stack<>();
		boolean Duplicate = false;
		for (int i = 0; i < s.length(); i++) {
			char Ch = s.charAt(i);
			if (st.size() == 0)
				st.push(Ch);
			else if (st.peek() == Ch) {
				Duplicate = true;
				continue;
			} else {
				if (Duplicate) {
					st.pop();
					Duplicate = false;
				}
				st.push(Ch);
			}

		}
		if (Duplicate) {
			st.pop();
			Duplicate = false;
		}
		StringBuilder ans = new StringBuilder();
		while (st.size() > 0)
			ans = ans.append(st.pop());

		if (ans.length() == s.length())
			return ans.reverse().toString();

		return (removeDuplicate(ans.reverse().toString()));
	}
	
}
