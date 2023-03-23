package com.junit.app.model;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

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

	// T(c)=O(N) and S(C)=O(n)
	public static int findMaxLen(String S) {
		Stack<Integer> st = new Stack<>();
		st.push(-1);
		int res = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				st.push(i);
			} else {
				st.pop();
				if (st.empty())
					st.push(i);
				else
					res = Math.max(res, i - st.peek());
			}
		}
		return res;
	}

	// T(c)=O(|str1|+|str2|) and S(c)= O(Number of different characters).
	public static boolean areIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		Map<Character, Integer> m1 = new HashMap<>();
		Map<Character, Integer> m2 = new HashMap<>();

		for (Integer i = 0; i < str1.length(); i++) {

			if (m1.put(str1.charAt(i), i) != m2.put(str2.charAt(i), i)) {
				return false;
			}
		}
		return true;
	}

	// T(C)=O(|s|) and S(C)=O(constant)
	public static String removeDuplicate(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				// map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				continue;
			} else {
				map.put(str.charAt(i), 1);
				res += str.charAt(i);
			}
		}
		/*
		 * for (Character set : map.keySet()) { res += set; }
		 */
		return res;
	}
	
	// T(C)=O(|S|) and S(C)= O(K), where K is Constant.
		public static int longestSubstrDistinctChars(String S) {
			int l = 0, r = 0;
			int maxlength = 0;
			Map<Character, Integer> map = new HashMap<>();
			while (r < S.length()) {
				if (map.containsKey(S.charAt(r))) {
					map.remove(S.charAt(l));
					l++;
				} else {
					map.put(S.charAt(r), 1);
					r++;
					maxlength = Math.max(maxlength, (r - l));
				}
			}

			return maxlength;
		}
		
		public static int lps(String s) {
			int n = s.length();
			if (n < 2)
				return 0;
			int i = 0;
			int j = 1;
			while (j < n) {
				if (s.charAt(i) == s.charAt(j)) {
					i++;
					j++;
				} else {
					j = j - i + 1;
					i = 0;
				}
			}
			return i;
		}
		
		//T(c)=O(N)   and S(C)=O(N)
		public static boolean areRotations(String s1, String s2) {
			if (s1.length() != s2.length())
				return false;
			s1 = s1 + s1;
			int x = s1.indexOf(s2);
			if (x == -1)
				return false;
			return true;
		}
		
		//T(C)=O(n2)  and S(C)=O(n2)
		public static int LongestRepeatingSubsequence(String str) {
			int n = str.length();
			int[][] dp = new int[n + 1][n + 1];
			for (int i = n - 1; i >= 0; i--) {
				for (int j = n - 1; j >= 0; j--) {
					if (i != j && str.charAt(i) == str.charAt(j)) {
						dp[i][j] = dp[i + 1][j + 1] + 1;
					} else {
			 	dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
					}
				}
			}
			return dp[0][0];
		}
		
		//T(C)=O(|S|)  and S(C)=O(|S|)
		public static int maxLength(String S) {
			int n = S.length();
			if (n == 1)
				return 0;
			int ans = Integer.MIN_VALUE;
			Stack<Integer> st = new Stack<>();
			st.push(-1);
			for (int i = 0; i < n; i++) {
				if (S.charAt(i) == '(') {
					st.push(i);
				} else {
					st.pop();
					if (st.isEmpty()) {
						st.push(i);
					} else
						ans = Math.max(ans, i - st.peek());
				}
			}
			if (ans == Integer.MIN_VALUE)
				return 0;
			return ans;
		}
		
		public static String largestNumber(String str) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String s = String.valueOf(ch);
			String s1 = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				s1 += s.charAt(i);
			}
			return s1;
		}

		static String max;
		
		public static int longestkSubstr(String s, int k) {
			HashMap<Character, Integer> map = new HashMap<>();
			int i = 0;
			int j = 0;
			int ans = -1;
			while (i < s.length()) {
				char c = s.charAt(i);
				map.put(c, map.getOrDefault(c, 0) + 1);
				if (map.size() == k) {
					ans = Math.max(ans, (i - j + 1));
				} else {
					while (map.size() > k) {
						char ch = s.charAt(j);
						int count = map.get(ch);
						if (count == 1)
							map.remove(ch);
						else
							map.put(ch, count - 1);
						j++;
					}
				}
				i++;
			}
			return ans;
		}
  
		public static String firstRepChar(String S) {
			HashMap<Character, Integer> map = new LinkedHashMap<>();
			String response = "";

			for (int i = 0; i < S.length(); i++) {
				if (map.containsKey(S.charAt(i))) {
					map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
					if (map.get(S.charAt(i)) > 1) {
						response = response + S.charAt(i);
						return response;
					}
				}

				else {
					map.put(S.charAt(i), 1);
				}
			}

			return "-1";
		}

}
