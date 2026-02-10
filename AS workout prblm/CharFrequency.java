public class CharFrequency {
    public static void main(String[] args) {
        String s = "programming";
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            if (c != ' ')
                freq[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char) i + " -> " + freq[i]);
        }
    }
}
