import java.util.*;

public class prod_of_array_except_itself {

    public static ArrayList<Integer> productExceptSelf(ArrayList<Integer> list) {

        int n = list.size();

        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize answer list with 1
        for (int i = 0; i < n; i++) {
            ans.add(1);
        }

        // Prefix Product
        for (int i = 1; i < n; i++) {
            ans.set(i, ans.get(i - 1) * list.get(i - 1));
        }

        int suffix = 1;

        // Multiply by Suffix Product
        for (int i = n - 1; i >= 0; i--) {

            ans.set(i, ans.get(i) * suffix);

            suffix *= list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4));

        System.out.println(productExceptSelf(list));
    }
}