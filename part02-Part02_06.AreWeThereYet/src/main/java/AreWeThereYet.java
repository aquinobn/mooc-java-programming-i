
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;
        do {
            System.out.println("Give a number:");
            num = Integer.parseInt(scanner.nextLine());
        } while (num != 4);
        scanner.close();
    }
}
