
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean value;

        System.out.println("Write something:");

        value = Boolean.valueOf(scanner.nextLine());

        System.out.println("True or false? " + value);
        
        scanner.close();

    }
}
