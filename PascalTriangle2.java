import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    static List<Integer> getRowTriangle(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(PascalTriangle2.getRowTriangle(3));
    }
}
