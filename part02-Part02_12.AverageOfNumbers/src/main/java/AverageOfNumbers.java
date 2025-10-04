
import java.util.Scanner;

public class AverageOfNumbers {

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

                sum = sum + number;

            } catch (Exception e) {
                System.out.println("Not a number. Try again!");
                continue;
            }                       

            ++counter;
        }

        System.out.println("Average of the numbers: " + (sum / counter));

        scanner.close();

    }
}
