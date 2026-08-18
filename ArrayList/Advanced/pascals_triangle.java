import java.util.*;

public class pascals_triangle {

    public static ArrayList<ArrayList<Integer>> generate(int n) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {

                int value = result.get(i - 1).get(j - 1)
                           + result.get(i - 1).get(j);

                row.add(value);
            }

            // Last element is always 1
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        ArrayList<ArrayList<Integer>> result = generate(n);

        System.out.println(result);
    }
}