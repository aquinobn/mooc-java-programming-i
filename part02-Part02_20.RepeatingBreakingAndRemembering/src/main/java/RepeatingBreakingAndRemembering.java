import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = 0, sum = 0, counter = 0, even = 0;

        System.out.println("Give numbers:");

        while (true) {
            number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }
            sum = sum + number;
            counter++;
            if (number % 2 == 0) {
                even++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        if (counter != 0) {
            System.out.println("Average: " + (1.0 * sum / counter));
        } else {
            System.out.println("Average: 0.0");
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (counter - even));

        scanner.close();
    }
}
