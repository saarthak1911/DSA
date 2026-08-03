import java.util.*;

public class merge_lists {

    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 3, 5, 7));

        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(2, 4, 6, 8));

        ArrayList<Integer> ans = merge(list1, list2);

        System.out.println(ans);
    }
}