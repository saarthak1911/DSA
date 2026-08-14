import java.util.*;

public class matrix_transpose {

    public static ArrayList<ArrayList<Integer>> transpose(
            ArrayList<ArrayList<Integer>> matrix) {

        int rows = matrix.size();
        int cols = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int j = 0; j < cols; j++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int i = 0; i < rows; i++) {
                row.add(matrix.get(i).get(j));
            }

            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));

        ArrayList<ArrayList<Integer>> result = transpose(matrix);

        System.out.println(result);
    }
}