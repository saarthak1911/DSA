import java.util.*;

public class sum_pair {

    public static void findPair(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) + " " + list.get(j));
                    return;
                }
            }
        }

        System.out.println("No Pair Found");
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2, 7, 11, 15));

        findPair(list, 9);
    }
}