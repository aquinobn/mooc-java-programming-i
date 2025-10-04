
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();
        try {            
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()){
                lines.add(fileScanner.nextLine());
            }
            fileScanner.close();           
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        if (!lines.contains(searchedFor)) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }
        
        scanner.close();
    }
}
