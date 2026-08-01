import java.util.*;

public class all_duplicate {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 2));

        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {

                    // Add only if not already present
                    if (!duplicates.contains(list.get(i))) {
                        duplicates.add(list.get(i));
                    }
                }
            }
        }

        System.out.println(duplicates);
    }
}