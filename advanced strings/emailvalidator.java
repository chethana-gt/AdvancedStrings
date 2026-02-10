public class emailvalidator {
    public static void main(String[] args) {
        String email = "test@gmail.com";

if(email.contains("@") && email.endsWith(".com")) {
    System.out.println("Valid Email");
} else {
    System.out.println("Invalid Email");
}

}
}
