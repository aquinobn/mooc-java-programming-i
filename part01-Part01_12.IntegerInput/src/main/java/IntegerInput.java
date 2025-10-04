
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = 0;

        System.out.println("Give a number:");

        value = Integer.valueOf(scanner.nextLine());

        System.out.println("You gave the number " + value);
        
        scanner.close();
    }
}
