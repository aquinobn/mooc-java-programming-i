import java.util.Scanner;

public class UserInterface {
    
    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface (Container first, Container second, Scanner scanner) {
        this.first = first;
        this.second = second;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            printStates();

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
                first.add(amount);
                continue;
            }

            if (command.equals("move")) {
                int firstBefore = first.contains();             
                first.remove(amount);
                int firstNow = first.contains();
                second.add(firstBefore - firstNow);
                continue;
            }

            if (command.equals("remove")) {             
                second.remove(amount);
                continue;
            }
        }        
    }

    private void printStates() {
        System.out.println("First: "+first.toString());
        System.out.println("Second: "+second.toString());
    }
}
