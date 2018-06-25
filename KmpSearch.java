public class KmpSearch {
	public static void main(String[] args) {
		String text = "XYZABCDDDDABCVUYFABCD"; //should get `True` as output.
		String pattern = "ABCD";
		int m = pattern.length();
		int[] lps = new int[m];

		/* LPS logic starts here */
		int len = 0, i = 1;
		while(i < m) {
			if(pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if(len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = len;
					i++;
				}
			}
		}

		/* Now, out `lps` array is ready */
		for(Integer each : lps) {
			System.out.print(each + " ");
		}

		/* KMP algorithm logic starts here */
		i = 0;
		int j = 0;
		while(i < text.length() && j < pattern.length()) {
			if(text.charAt(i) == pattern.charAt(j)) {
				j++;
				i++;
			} else {
				if(j != 0) {
					j = lps[j-1];
				}
				else {
					i++;
				}
			}
		}
		if(j == pattern.length()) System.out.println("\ntrue");
		else System.out.println("false");
	}
}

/**
 * Pattern Length: m
 * Text Length: n
 * Time Complexity: O(m+n)
 * Space Complexity: O(m)
 */
