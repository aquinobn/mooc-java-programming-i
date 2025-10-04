
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = 0;

        while (true) {

            System.out.println("Give a number:");
            num = Integer.parseInt(scanner.nextLine());

            if (num > 0) {
                System.out.println(Math.pow(num, 2));                
            } else if (num < 0) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }

        }

        scanner.close();
    }
}
