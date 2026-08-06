import java.util.*;

public class majority_ele {

    public static int majorityElement(ArrayList<Integer> list) {

        Collections.sort(list);

        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2,2,1,1,1,2,2));

        System.out.println(majorityElement(list));
    }
}