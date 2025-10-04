import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private MainController mainController;

    public UserInterface(Scanner scanner, MainController mainController) {
        this.scanner = scanner;
        this.mainController = mainController;
    }

    public void start() {

        while (true) {

            System.out.println("?");
            String command = scanner.nextLine();
            if (command.isEmpty()) {
                continue;
            }

            if (command.toLowerCase().equals("quit")) {
                break;
            }

            if (command.toLowerCase().equals("add")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                if (latinName.isEmpty()) {
                    continue;
                }

                Bird bird = new Bird(name, latinName);

                mainController.addBird(bird);
            }

            if (command.toLowerCase().equals("observation")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }
                if (!mainController.addObservation(name)) {
                    System.out.println("Error when adding an observation to " + name);
                }
            }

            if (command.toLowerCase().equals("all")) {

                String output = mainController.dbToString();
                System.out.println(output);
            }

            if (command.toLowerCase().equals("one")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }
                String output = mainController.birdToString(name);
                System.out.println(output);
            }
        }
    }
}
