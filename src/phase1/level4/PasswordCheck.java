package phase1.level4;

public class PasswordCheck {
    public static void main(String[] args) {
        String password = "abc123def";
        boolean hasDigit = false;

        if (password.length() < 8)
            System.out.println("Password is short");
        else{
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
        }

        if (hasDigit==true)
            System.out.println("Valid Password");
        else
            System.out.println("Password needs atleast a digit");
    }
}
