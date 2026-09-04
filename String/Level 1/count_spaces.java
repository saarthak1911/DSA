public class count_spaces {
    public static void main(String[] args) {

        String str = "Hello World Java";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Spaces = " + count);
    }
}