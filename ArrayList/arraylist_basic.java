
import java.util.ArrayList;

public class arraylist_basic {
    public static void main(String[] args) {

        // Initialize an ArrayList of Integer type
        ArrayList <Integer> list = new ArrayList<>();

        //Create an ArrayList and add 10 integers.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);    
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        //Print all elements 
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
        

        //Find the size of an ArrayList
        System.out.println(list.size());

        //Get an element at a given index.
        System.out.println(list.get(5));

        //Update an element using set().
        list.set(3,11);

        //Remove an element by index.
        list.remove(4);

        //Remove an element by value.
        list.remove(Integer.valueOf(5));

        //Check whether an element exists using contains().
        System.out.println(list.contains(7))    ; //true or false
        
        //Find the index of an element.
        System.out.println(list.indexOf(7));

        //Clear the ArrayList.
        list.clear();




        }
    }
