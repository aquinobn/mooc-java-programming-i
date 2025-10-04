import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:\n" + 
                            "1 - add a joke\n" + 
                            "2 - draw a joke\n" + 
                            "3 - list jokes\n" + 
                            "X - stop");
            String choise = scanner.nextLine();

            if (choise.toUpperCase().equals("X")) {
                return;
            }

            if (choise.equals("1")) {

                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();

                jokeManager.addJoke(joke);
            }

            if (choise.equals("2")) {
                System.out.println("Printing one random joke.");
                System.out.println(jokeManager.drawJoke());
            }

            if (choise.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }

    
}
