import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.toLowerCase().equals("stop")) {
                return;
            }

            if (command.toLowerCase().equals("add")) {

                System.out.println("To add: ");
                String task = scanner.nextLine();
                if (task.isEmpty()) {
                    continue;
                }

                this.todoList.add(task);
            }

            if (command.toLowerCase().equals("list")) {

                this.todoList.print();
            }

            if (command.toLowerCase().equals("remove")) {

                int id = -1;
                boolean validInput = false;

                do {
                    System.out.println("Which one is removed?");
                    try {
                        id = scanner.nextInt();

                        if (this.todoList.validTaskNumber(id)) {
                            validInput = true;
                        } else {
                            System.out.println("Error: Please enter a new task number.");
                        }                        

                    } catch (Exception e) {
                        scanner.next(); // Clear bad input
                        System.out.println("Error: Please enter a new task number.");
                    }
                } while (!validInput);

                this.todoList.remove(id);
            }
            
            System.out.println("Unknown command");
        }       

    }
}
