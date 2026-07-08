import java.util.ArrayList;

public class arraylist_intermediate_questions {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        // Second Largest
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Second Largest = " + secondMax);

        // Second Smallest
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num > min && num < secondMin) {
                secondMin = num;
            }
        }

        System.out.println("Smallest = " + min);
        System.out.println("Second Smallest = " + secondMin);


        //Remove duplicate elements.
        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                list.remove(j);
                j--;
                }
            }
        }
        System.out.println(list);

        //Find the frequency of each element.
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            System.out.println("Frequency of " + list.get(i) + " is: " + count);
        }

        //Find the most frequent element.

        int maxCount = 0;
        int mostFrequent = list.get(0);

        for (int i = 0; i < list.size(); i++) {

            int count = 0;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                count++;
                }
            }

            if (count > maxCount) {
            maxCount = count;
            mostFrequent = list.get(i);
            }
        }
        System.out.println("Most Frequent Element: " + mostFrequent);
        System.out.println("Frequency: " + maxCount);



        // Rotate right by one position

        int last = list.get(list.size() - 1); // Store the last element

        for (int i = list.size() - 1; i > 0; i--) {
            list.set(i, list.get(i - 1)); // Shift elements to the right
        }

        list.set(0, last); // Set the first element to the last element
        System.out.println(list);


    }
}