import java.util.*;

public class matrix_multiplication {

    public static ArrayList<ArrayList<Integer>> multiply(
            ArrayList<ArrayList<Integer>> a,
            ArrayList<ArrayList<Integer>> b) {

        int rowsA = a.size();
        int colsA = a.get(0).size();

        int rowsB = b.size();
        int colsB = b.get(0).size();

        // Check multiplication condition
        if (colsA != rowsB) {
            return new ArrayList<>();
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rowsA; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < colsB; j++) {

                int sum = 0;

                for (int k = 0; k < colsA; k++) {
                    sum += a.get(i).get(k) * b.get(k).get(j);
                }

                row.add(sum);
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        a.add(new ArrayList<>(Arrays.asList(1, 2)));
        a.add(new ArrayList<>(Arrays.asList(3, 4)));

        ArrayList<ArrayList<Integer>> b = new ArrayList<>();

        b.add(new ArrayList<>(Arrays.asList(5, 6)));
        b.add(new ArrayList<>(Arrays.asList(7, 8)));

        ArrayList<ArrayList<Integer>> result = multiply(a, b);

        System.out.println(result);
    }
}