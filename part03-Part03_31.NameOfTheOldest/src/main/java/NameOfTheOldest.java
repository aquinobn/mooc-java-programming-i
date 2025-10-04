
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int oldest = 0;
        String oldestName = "";        

        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }            

            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);

            if (age > oldest) {
                oldest = age;
                oldestName = data[0];
            }          
        }
        System.out.println(oldestName);
        scanner.close();
    }
}
