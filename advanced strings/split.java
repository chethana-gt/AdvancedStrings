public class split {
    public static void main(String[] args) {
        String s = "java,python,c";
String[] arr = s.split(",");

for(String lang : arr)
    System.out.println(lang);

        
    }
}