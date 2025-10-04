
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers: ");

        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            allStats.addNumber(number);
            if (number % 2 == 0) {
                evenStats.addNumber(number);
            } else {
                oddStats.addNumber(number);
            }            
        }

        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());

        scanner.close();
    }
}
