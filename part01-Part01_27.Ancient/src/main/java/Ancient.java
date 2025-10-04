
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");

        Integer value = Integer.parseInt(scan.nextLine());

        if (value < 2015) {
            System.out.println("Ancient history!");
        }
            
        scan.close();
    }
}
