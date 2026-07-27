import java.util.*;

public class find_missing_num {

    public static int findMissing(ArrayList<Integer> list, int n) {

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : list) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 4, 5));

        System.out.println(findMissing(list, 5));
    }
}