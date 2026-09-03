public class count_digits {
    public static void main(String[] args) {

        String str = "abc123xyz45";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }

        System.out.println("Digits = " + count);
    }
}