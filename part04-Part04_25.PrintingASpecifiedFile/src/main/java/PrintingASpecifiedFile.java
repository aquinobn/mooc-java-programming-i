
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String filePath = scanner.nextLine();
        try {
            scanner = new Scanner(Paths.get(filePath));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());        
        } 
    }
}
