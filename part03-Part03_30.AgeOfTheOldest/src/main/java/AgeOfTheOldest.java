
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int oldest = 0;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }            

            String[] data = input.split(",");
            int age = Integer.valueOf(data[1]);
            oldest = (age > oldest) ? age : oldest;            
        }
        System.out.println(String.valueOf(oldest));
        scanner.close();
    }
}
