public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }

        // Print the result
        System.out.println(sb.toString());
    }
}