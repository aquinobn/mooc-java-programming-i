
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer counter = 0;

        while (true) {            

            try {
                System.out.println("Give a number:");
                Integer number = Integer.parseInt((scanner.nextLine()));    

                if (number == 0) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Not a number. Try again!");
                continue;
            }           

            ++counter;
        }

        System.out.println("Number of numbers: " + counter);

        scanner.close();
    }
}
