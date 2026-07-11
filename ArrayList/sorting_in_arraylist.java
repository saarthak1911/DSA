import java.util.ArrayList;
import java.util.Collections;

public class sorting_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(4);

    //Sort in ascending order.
    list.sort(null); //     list.sort((a, b) -> a - b);
    System.out.println("Sorted in ascending order: " + list);

    //Sort in descending order.
    list.sort((a, b) -> b - a);
    System.out.println("Sorted in descending order: " + list);

    ArrayList<String> strList = new ArrayList<>();

        strList.add("Banana");
        strList.add("Apple");
        strList.add("Mango");
        strList.add("Orange");
        strList.add("Grapes");

        Collections.sort(strList);   //strList.sort((a, b) -> a.compareTo(b));

    //Sort by string length.
    strList.sort((a, b) -> a.length() - b.length()); 
    //Collections.sort(strList, (a, b) -> a.length() - b.length());


    



    }
}
