public class LongestWord {
    public static void main(String[] args) {
        String s = "Java is extremely powerful";
        String[] words = s.split(" ");

        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
