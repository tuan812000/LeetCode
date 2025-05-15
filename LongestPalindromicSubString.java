public class LongestPalindromicSubString {
    static String longestPalindromicSubString(String str) {
        if (str == null || str.length() < 1)
            return "";
        int left = 0, right = 0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = LongestPalindromicSubString.expandAroundCenter(str, i, i);
            int len2 = LongestPalindromicSubString.expandAroundCenter(str, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > right - left) {
                left = i - (len - 1) / 2;
                right = i + len / 2;
            }
        }
        return str.substring(left, right + 1);
    }

    static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public void main(String[] args) {
        System.out.println("Longest Palindromic SubString: " +
                LongestPalindromicSubString.longestPalindromicSubString("badad"));
    }
}
