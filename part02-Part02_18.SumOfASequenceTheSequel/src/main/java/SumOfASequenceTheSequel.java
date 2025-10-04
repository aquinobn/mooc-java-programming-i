
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer result = 0;

        System.out.println("First number?");
        Integer first = Integer.parseInt(scanner.nextLine());

        System.out.println("Last number?");
        Integer last = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= last; i++) {
            result = result + i;
        }

        System.out.println("The sum is " + result);
        scanner.close();

    }
}
