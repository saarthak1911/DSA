import java.util.ArrayList;

public class arraylist_methods {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //add()
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        //add(index, value)
        list.add( 5, 6);

        //addAll()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);   
        list2.add(8);
        list.addAll(list2);

        //remove()
        list.remove(0); //removes the element at index 0

        //removeAll()
        list.removeAll(list2); //removes all elements in list2 from list

        //retainAll()
        list.retainAll(list2); //retains only the elements in list2 from list

        //contains()
        boolean contains = list.contains(3); //checks if list contains 3

        //containsAll()
        boolean containsAll = list.containsAll(list2); //checks if list contains all elements in list2

        //indexOf()
        list.indexOf(3); //returns the index of the first occurrence of 3

        //lastIndexOf()
        list.lastIndexOf(3); //returns the index of the last occurrence of 3

        //set()
        list.set(0, 10); //sets the element at index 0 to 10

        //get()
        list.get(0); //returns the element at index 0

        //clear()
        list2.clear(); //removes all elements from the list

        //isEmpty()
        boolean isEmpty = list2.isEmpty(); //checks if the list is empty

        //size()
        int size = list.size(); //returns the number of elements in the list

        //toArray()
        Object[] array = list.toArray(); //converts the list to an array
        System.out.println("Array: " + java.util.Arrays.toString(array));

        //subList()
        list.subList(0, 2); //returns a view of the portion of the list between the specified fromIndex, inclusive, and toIndex, exclusive

        //clone()
        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone();
        System.out.println(copy); //returns a shallow copy of the list

            

    }
}
