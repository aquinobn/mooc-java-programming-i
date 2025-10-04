
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = consoleScanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                list.add(name);
            }
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = consoleScanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
        consoleScanner.close();
        System.out.println("Thank you!");
    }
}
