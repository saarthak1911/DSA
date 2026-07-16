import java.util.ArrayList;

public class arraylist_and_string {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Banana");
        list.add("fig");
        list.add("Mango");
        list.add("Oranges");
        list.add("Grapes");


        //Store names and print them.
        System.out.println("Names in the list: " + list);

        //Find the longest string.
        String longestString = list.get(0);
        for( int i = 1; i < list.size(); i++) {
            if(list.get(i).length() > longestString.length()) {
                longestString = list.get(i);
            }
        }
        System.out.println("Longest string: " + longestString);


        //Find the shortest string.
        String shortestString = list.get(0);
        for( int i = 1; i < list.size(); i++) {
            if(list.get(i).length() < shortestString.length()) {
                shortestString = list.get(i);
            }
        }
        System.out.println("Shortest string: " + shortestString);


        //Remove all strings starting with a vowel
        for (int i = 0; i < list.size(); i++) {

        String word = list.get(i).toLowerCase();

            if (word.startsWith("a") ||
                word.startsWith("e") ||
                word.startsWith("i") ||
                word.startsWith("o") ||
                word.startsWith("u")) {

                    list.remove(i);
                    i--; // Adjust index after removal
            }
        }
        System.out.println(list);



        //Convert all strings to uppercase.
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i).toUpperCase();
            list.set(i, word);
        }
        System.out.println("Uppercase strings: " + list);



        //Count words having more than 5 letters.
        int count = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > 5) {
                count++;
            }
        }
        System.out.println("Number of words with more than 5 letters: " + count);



        //Find duplicate strings.
        for (int i = 0; i < list.size(); i++) {

             for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }
        
        


    }
}
