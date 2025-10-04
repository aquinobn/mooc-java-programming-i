
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0, counter = 0;         

        while (true) {            

            try {
                System.out.println("Give a number:");
                Integer number = Integer.parseInt((scanner.nextLine()));    

                if (number == 0) {
                    break;
                }

                sum = sum + number;

            } catch (Exception e) {
                System.out.println("Not a number. Try again!");
                continue;
            }                       

            ++counter;
        }

        System.out.println("Number of numbers: " + counter);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
