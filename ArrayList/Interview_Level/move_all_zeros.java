    import java.util.*;

public class move_all_zeros {


public class Main {

    public static void moveZeros(ArrayList<Integer> list) {

        int j = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != 0) {

                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);

                j++;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(0, 1, 0, 3, 12));

        moveZeros(list);

        System.out.println(list);
    }
}
}
