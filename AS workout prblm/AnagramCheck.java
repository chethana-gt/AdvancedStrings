public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Dormitory".replaceAll(" ", "").toLowerCase();
        String s2 = "Dirty room".replaceAll(" ", "").toLowerCase();

        int[] freq = new int[256];

        for (char c : s1.toCharArray()) freq[c]++;
        for (char c : s2.toCharArray()) freq[c]--;

        boolean isAnagram = true;
        for (int f : freq) {
            if (f != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}
