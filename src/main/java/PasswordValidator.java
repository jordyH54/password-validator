public class PasswordValidator {

    public boolean isValid(String password) {

        if (password == null) {
            return false;
        }

        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{6,}$";
        return password.matches(regex);
    }
}
