
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int sumYear = 0;
        String longestName = "";
        int inputCount = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }            

            String[] data = input.split(",");
            
            String name = data[0];       
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            int year = Integer.valueOf(data[1]);
            sumYear += year;
            inputCount++;
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + 1.0 * sumYear / inputCount);

        scanner.close();
    }
}
