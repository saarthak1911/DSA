import java.util.ArrayList;
import java.util.Collections;

public class arraylist_basic_questions {

    public static void main(String[] args) {

        // Initialize an ArrayList of Integer type
        ArrayList <Integer> list = new ArrayList<>();

        //Create an ArrayList and add 5 integers.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);    
        list.add(5);
    
        //Find the sum of all elements.
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println("Sum of all elements: " + sum);

        //Find the average.
        int avg = sum / list.size();
        System.out.println("Average of all elements: " + avg);

        //Find the largest element.
        int max = list.get(0);

        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println("Largest element: " + max);

        //Find the smallest element.
        int min = list.get(0);
        for(int i = 0; i < list.size(); i++ ){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("Smallest element: " + min);

        //Count even numbers.
        int countEven = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0){
                countEven++;
            }
        }
        System.out.println("Count of even numbers: " + countEven);

        // Count odd numbers.
        int countOdd = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                countOdd++;
            }
        }
        System.out.println("Count of odd numbers: " + countOdd);

        //Reverse an ArrayList without using Collections.reverse().
        int temp;
        for(int i = 0; i< list.size()/2; i++){
            temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }
        System.out.println("Elements in reverse order: " + list);

        //Reverse using Collections.reverse().
        System.out.println("Elements in reverse order using Collections.reverse(): " + list);
        Collections.reverse(list);

        //Print elements in reverse order.
        for(int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }
        System.out.println("Elements in reverse order: " + list);
        
        //Copy one ArrayList into another.
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println("Copied ArrayList: " + list2);

    }
}
