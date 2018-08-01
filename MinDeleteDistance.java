import java.util.Scanner;

public class MinDeleteDistance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		in.close();
		System.out.println(minimumDeleteSum(s1, s2));
	}

	public static int minimumDeleteSum(String s1, String s2) {
		int m = s1.length(), n = s2.length(), MAX = Integer.MAX_VALUE;
		char[] a = s1.toCharArray(), b = s2.toCharArray();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = m; i >= 0; i--) {
			for (int j = n; j >= 0; j--) {
				if (i < m || j < n)
					dp[i][j] = i < m && j < n && a[i] == b[j] ? dp[i + 1][j + 1]
							: Math.min((i < m ? a[i] + dp[i + 1][j] : MAX), (j < n ? b[j] + dp[i][j + 1] : MAX));
			}
		}
		return dp[0][0];
	}

}
