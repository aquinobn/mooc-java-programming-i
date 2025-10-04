
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        Integer num = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.pow(num, 2));

        scanner.close();
    }
}
