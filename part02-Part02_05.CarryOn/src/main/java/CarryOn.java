
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("Shall we carry on?");
            input = scanner.nextLine().toLowerCase();
        } while (!input.equals("no"));
        scanner.close();
    }
}
