
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer result = 0;

        System.out.println("Last number?");
        Integer input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            result = result + i;
        }

        System.out.println("The sum is " + result);
        scanner.close();
    }
}
