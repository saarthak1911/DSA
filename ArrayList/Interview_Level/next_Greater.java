import java.util.*;

public class next_Greater {

    public static ArrayList<Integer> nextGreater(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int greater = -1;

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j) > list.get(i)) {
                    greater = list.get(j);
                    break;
                }
            }

            result.add(greater);
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(4, 5, 2, 10, 8));

        System.out.println(nextGreater(list));
    }
}