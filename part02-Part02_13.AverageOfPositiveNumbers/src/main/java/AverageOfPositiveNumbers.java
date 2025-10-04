
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0, counter = 0.0;

        while (true) {

            try {
                System.out.println("Give a number:");
                Double number = Double.parseDouble((scanner.nextLine()));

                if (number == 0) {
                    break;
                }

                if (number > 0) {
                    sum = sum + number;
                    ++counter;
                }

            } catch (Exception e) {
                System.out.println("Not a number. Try again!");
                continue;
            }
        }

        if (counter <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + (sum / counter));
        }        

        scanner.close();
    }
}
