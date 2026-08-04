import java.util.*;

public class remove_duplicate_from_sorted {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1,1,2,2,3,4,4,5));

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(list.get(0));

        for (int i = 1; i < list.size(); i++) {

            if (!list.get(i).equals(list.get(i - 1))) {
                ans.add(list.get(i));
            }
        }

        System.out.println(ans);
    }
}