
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give first number:");
        Integer first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give second number:");
        Integer second = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.sqrt((double)(first+second)));

        scanner.close();
    }  
}
