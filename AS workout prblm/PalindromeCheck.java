public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw";
        s = s.replaceAll(" ", "").toLowerCase();

        int i = 0, j = s.length() - 1;
        boolean isPal = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++; j--;
        }

        System.out.println(isPal ? "Palindrome" : "Not Palindrome");
    }
}
