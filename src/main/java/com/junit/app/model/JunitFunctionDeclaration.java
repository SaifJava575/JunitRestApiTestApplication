package com.junit.app.model;

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
}
