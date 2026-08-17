import java.util.*;

public class rotate_by_90 {

    public static void rotate90(ArrayList<ArrayList<Integer>> matrix) {

        int n = matrix.size();

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix.get(i).get(j);

                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix.get(i).get(left);

                matrix.get(i).set(left, matrix.get(i).get(right));
                matrix.get(i).set(right, temp);

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        rotate90(matrix);

        System.out.println(matrix);
    }
}