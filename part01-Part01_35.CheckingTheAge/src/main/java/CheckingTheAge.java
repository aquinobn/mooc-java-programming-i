
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        Integer value = Integer.parseInt(scan.nextLine());

        if (value >= 0 && value <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
        scan.close();
    }
}
