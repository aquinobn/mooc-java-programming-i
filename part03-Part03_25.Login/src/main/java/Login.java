
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine().toLowerCase();

        System.out.println("Enter password: ");
        String password = scanner.nextLine().toLowerCase();

        if (checkCredentials(username, password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();
    }

    public static boolean checkCredentials(String username, String password) {

        if (username.toLowerCase().equals("alex") && password.equals("sunshine")) {
            return true;
        }
        if (username.toLowerCase().equals("emma") && password.equals("haskell")) {
            return true;
        }

        return false;
    }
}
