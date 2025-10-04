
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        Integer number = Integer.parseInt(scanner.nextLine());

        number = (number < 0) ? -number : number;

        System.out.println(number);

        scanner.close();
    }
}
