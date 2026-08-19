import java.util.*;

public class flatten_2d_list {

    public static ArrayList<Integer> flatten(
            ArrayList<ArrayList<Integer>> matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.size(); i++) {

            for (int j = 0; j < matrix.get(i).size(); j++) {

                result.add(matrix.get(i).get(j));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5)));
        matrix.add(new ArrayList<>(Arrays.asList(6, 7, 8)));

        System.out.println(flatten(matrix));
    }
}