import java.util.ArrayList;

public class search_in_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        

        //Linear Search
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == 3){
                System.out.println("Element found at index: " + i);
                break;
            }
        }


        //Binary Search (sorted ArrayList)
        int target = 4;
        int left = 0;
        int right = list.size() - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;

            if (list.get(mid) == target) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        //Find first occurrence.
        int numToFind = 3;
        int firstOccurrenceIndex = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == numToFind) {
                firstOccurrenceIndex = i;
                break;
            }
        }
        System.out.println("First occurrence of " + numToFind + " is at index: " + firstOccurrenceIndex);

        //Find last occurrence.
        int numToFindLast = 3;
        int lastOccurrenceIndex = -1;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == numToFindLast) {
                lastOccurrenceIndex = i;
                break;
            }
        }
        System.out.println("Last occurrence of " + numToFindLast + " is at index: " + lastOccurrenceIndex);


        //Count occurrences of an element.
        int numToCount = 3;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == numToCount) {
                count++;
            }
        }
        System.out.println("Count of " + numToCount + " is: " + count);

    }
}
