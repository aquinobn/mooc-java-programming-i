
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer number = Integer.parseInt(scanner.nextLine());

        if (number > 100) {
            scanner.close();
            return;
        }

        for (int i = number; i <= 100; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
