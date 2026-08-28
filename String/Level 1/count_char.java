public class count_char {
    public static void main(String[] args) {

        String str = "Hello";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println(count);
    }
}