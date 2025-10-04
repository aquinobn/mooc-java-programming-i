
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        Integer first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");

        Integer second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");

        Integer third = Integer.parseInt(scanner.nextLine());

        System.out.println("The average is " + (first + second + third) / 3.0);

        scanner.close();

    }
}
