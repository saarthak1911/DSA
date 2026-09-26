public class rev_using_stringBuilder {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println("Reversed String = " + sb);
    }
}