
import java.util.*;

public class spiral_matrix {

    public static ArrayList<Integer> spiralMatrix(
            ArrayList<ArrayList<Integer>> matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.size() - 1;

        int left = 0;
        int right = matrix.get(0).size() - 1;

        while (top <= bottom && left <= right) {

            // 1. Left -> Right
            for (int j = left; j <= right; j++) {
                result.add(matrix.get(top).get(j));
            }
            top++;

            // 2. Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix.get(i).get(right));
            }
            right--;

            // 3. Right -> Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix.get(bottom).get(j));
                }
                bottom--;
            }

            // 4. Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix.get(i).get(left));
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        System.out.println(spiralMatrix(matrix));
    }
}