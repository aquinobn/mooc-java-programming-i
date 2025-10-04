
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first number:");
        Integer first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give second number:");
        Integer second = Integer.parseInt(scanner.nextLine());

        if (first == second) {
            System.out.println(first + " is equal to " + second);
        } else if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else {
            System.out.println(first + " is smaller than " + second);
        }        

        scanner.close();
    }
}
