
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File name: ");
        String file = scanner.nextLine();
        scanner.close();

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();                
                if (line.isEmpty()) {
                    continue;
                }        
                String[] parts = line.split(",");
                Integer year = Integer.valueOf(parts[1]);

                if (year == 1) {
                    System.out.println(parts[0]+", age: "+parts[1]+" year");
                } else {
                    System.out.println(parts[0]+", age: "+parts[1]+" years");
                }                               
            }
            fileScanner.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
