public class Main {
    public static void main(String[] args) {
        String login = "example33333333333333333333333333333333";
        String password = "password";
        String confirmPassword = "password";

        boolean isValid = LoginValidator.validate(login, password, confirmPassword);
        System.out.println("Is login and password valid? " + isValid);
    }
}

