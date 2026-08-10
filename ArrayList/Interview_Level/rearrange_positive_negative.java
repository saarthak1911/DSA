import java.util.*;

public class rearrange_positive_negative {

    public static ArrayList<Integer> rearrange(ArrayList<Integer> list) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int num : list) {

            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        positive.addAll(negative);

        return positive;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, -2, 3, -4, 5, -6));

        System.out.println(rearrange(list));
    }
}