import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validPassword = false;

        while (!validPassword) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            String validationMessage = validatePassword(password);

            if (validationMessage.equals("Password is valid.")) {
                System.out.println(validationMessage);
                validPassword = true;
            } else {
                System.out.println("Password is invalid. " + validationMessage);
            }
        }

        scanner.close();
    }

    public static String validatePassword(String password) {
        if (password.length() < 8) {
            return "Needs to be at least 8 characters long.";
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasUppercase) {
            return "Needs to include at least one uppercase letter.";
        }
        if (!hasLowercase) {
            return "Needs to include at least one lowercase letter.";
        }
        if (!hasDigit) {
            return "Needs to include at least one digit.";
        }

        return "Password is valid.";
    }
}