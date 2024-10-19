import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder names = new StringBuilder();
        String input;

        while (true) {
            System.out.println("Enter a name:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Quit")) {
                break;
            }

            names.append(input);

            System.out.println(names.toString());
        }
        scanner.close();
    }
}