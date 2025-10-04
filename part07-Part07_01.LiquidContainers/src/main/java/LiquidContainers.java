
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Error: Empty input!");
                continue;
            }
            
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");                        
            String command = "";
            int amount = 0;
            try {           
                command = parts[0];
                amount = Integer.valueOf(parts[1]);
                amount = Math.abs(amount);
            } catch (Exception e) {
                System.out.println("Error: Wrong command!");
                continue;
            }

            if (command.equals("add")) {
                
                first = (first + amount > 100) ? 100 : (first + amount);
                continue;
            }

            if (command.equals("move")) {
             
                int firstBefore = first;
                first = (first - amount < 0) ? 0 : (first - amount);
                amount = firstBefore - first;
                second = (second + amount > 100) ? 100 : (second + amount);
                continue;
            }

            if (command.equals("remove")) {
             
                second = (second - amount < 0) ? 0 : (second - amount);
                continue;
            }

        }        
    }

}
