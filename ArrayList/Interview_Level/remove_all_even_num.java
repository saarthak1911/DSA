    import java.util.*;

public class remove_all_even_num {

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, 15, 20, 25, 30, 35, 40));

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            if (it.next() % 2 == 0) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
    
}
