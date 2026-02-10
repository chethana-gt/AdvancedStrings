public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbcccc";
        String result = "";
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1);
                if (count > 1)
                    result += count;
                count = 1;
            }
        }

        System.out.println(result);
    }
}
