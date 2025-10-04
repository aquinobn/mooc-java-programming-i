
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        Integer number = Integer.parseInt(scanner.nextLine());

        System.out.println("Factorial: " + factorial(number));

        scanner.close();

    }

    private static Integer factorial (Integer a){
        if (a == 0) {
            return 1;
        } else {
            return a * factorial (a-1);
        }
    }
}
