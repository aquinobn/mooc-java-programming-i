
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");

        Integer speed = Integer.parseInt(scanner.nextLine());

        if (speed > 120) System.out.println("Speedy ticket!");

        scanner.close();
    }
}
