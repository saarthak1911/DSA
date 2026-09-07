public class convert_lower {
    public static void main(String[] args) {

        String str = "HELLO JAVA";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        System.out.println(result);
    }
}