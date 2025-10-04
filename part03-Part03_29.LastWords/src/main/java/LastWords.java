
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            printWords(text);
        }       

        scanner.close();
    }
    public static void printWords(String text) {       
        
        String[] strings = text.split(" ");
        
        if (strings.length == 0) {
            System.out.println("No words!");
        }

        System.out.println(strings[strings.length - 1]);
    }
}
