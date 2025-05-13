import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    static int longestSubStringMap(String str) {
        int maxLen = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < str.length(); right++) {
            if (map.containsKey(str.charAt(right))) {
                left = Math.max(map.get(str.charAt(right)) + 1, left);
            }
            map.put(str.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    static int longestSubStringSet(String str) {
        int maxLen = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    static int longestSubStringSetOther(String str) {
        int maxLen = 0;
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("Longest Sub String Map " + LongestSubString.longestSubStringMap(str));
        System.out.println("Longest Sub String Set " + LongestSubString.longestSubStringSet(str));
        System.out.println("Longest Sub String Other " + LongestSubString.longestSubStringSetOther(str));
    }
}
