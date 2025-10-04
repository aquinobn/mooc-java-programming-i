
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String inputId = scanner.nextLine();
            if (inputId.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }

            Item item = new Item(inputId, inputName);
            if (items.contains(item)) {
                continue;
            }
            
            items.add(item);
        }
        System.out.println("==Items==");
        for (Item item : items) {
            System.out.println(item.toString());
        }
        scanner.close();
    }
}
