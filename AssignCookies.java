import java.util.Arrays;

public class AssignCookies {
    static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
                count++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = { 1, 2, 3 }, s = { 1, 1 };
        System.out.println("Number of content: " + AssignCookies.findContentChildren(g, s));
    }
}
