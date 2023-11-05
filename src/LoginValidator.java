public class LoginValidator {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!isValidLogin(login)) {
                throw new WrongLoginException("Login does not meet the requirements");
            }
            if (!isValidPassword(password, confirmPassword)) {
                throw new WrongPasswordException("Password does not meet the requirements");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static boolean isValidLogin(String login) {
        if (login.length() >= 20) {
            return false;
        }
        return login.matches("[a-zA-Z0-9_]+");
    }

    private static boolean isValidPassword(String password, String confirmPassword) {
        if (password.length() >= 20 || !password.equals(confirmPassword)) {
            return false;
        }
        return password.matches("[a-zA-Z0-9_]+");
    }
}

    class WrongLoginException extends Exception {
        public WrongLoginException() {}

        public WrongLoginException(String message) {
            super(message);
        }
    }

    class WrongPasswordException extends Exception {
        public WrongPasswordException() {}

        public WrongPasswordException(String message) {
            super(message);
        }
    }


