
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double value = 0.0;

        System.out.println("Give a number:");

        value = Double.valueOf(scanner.nextLine());

        System.out.println("You gave the number " + value);
        
        scanner.close();

    }
}
