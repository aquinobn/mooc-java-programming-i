
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer sum = 0;

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
        }

        System.out.println("Sum of the numbers: " + sum);

        scanner.close();

    }
}
