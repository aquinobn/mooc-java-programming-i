
import java.util.Scanner;

public class LineByLine {

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

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
