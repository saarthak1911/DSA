public class char_at_idx {
    public static void main(String[] args) {

        String str = "Hello Java";
        int index = 6;

        if (index >= 0 && index < str.length()) {
            System.out.println("Character = " + str.charAt(index));
        } else {
            System.out.println("Invalid index");
        }
    }
}