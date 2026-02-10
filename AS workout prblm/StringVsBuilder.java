public class StringVsBuilder {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= 50000; i++) {
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start));

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 50000; i++) {
            sb.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start));
    }
}
