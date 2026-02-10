public class EmailValidation {
    public static void main(String[] args) {
        String email = "test@gmail.com";

        boolean valid =
                email.indexOf('@') > 0 &&
                email.indexOf('@') == email.lastIndexOf('@') &&
                email.indexOf('.') > email.indexOf('@') &&
                !email.contains(" ");

        System.out.println(valid ? "Valid" : "Invalid");
    }
}
