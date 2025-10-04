
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = "";

        System.out.println("Greetings! How are you doing?");

        msg = scanner.nextLine();          

        System.out.println("Oh, how interesting. Tell me more!");

        msg = scanner.nextLine();

        System.out.println("Thanks for sharing!");        
        
        scanner.close();
    }
}
