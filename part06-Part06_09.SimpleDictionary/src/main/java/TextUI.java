import java.util.Objects;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.toLowerCase().equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.toLowerCase().equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();

                System.out.println("Translation: ");
                String translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            }

            if (command.toLowerCase().equals("search")) {
                System.out.println("To be translated: ");
                String search = scanner.nextLine();

                /*
                 * String translatedWord = this.dictionary.translate(search);
                 * String output = (translatedWord == null) 
                 *      ? "Word carrot was not found" 
                 *      : this.dictionary.translate(search);
                 */
                String output = Objects.requireNonNullElse(
                        this.dictionary.translate(search),
                        "Word "+search+" was not found");

                System.out.println(output);
            }

            System.out.println("Unknown command");
        }
        return;
    }

}
