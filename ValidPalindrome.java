public class ValidPalindrome {
    static boolean isPalindrome(String str) {
        StringBuilder res = new StringBuilder();
        if (str == null || str.length() < 1)
            return false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                res.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String cleaned = res.toString();
        for (int i = 0; i < cleaned.length() / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        if (str == null || str.length() < 1)
            return false;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            if (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (Character.isLetterOrDigit(str.charAt(left)) != Character.isLetterOrDigit(str.charAt(right))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ValidPalindrome.isPalindrome("0P"));
    }
}
