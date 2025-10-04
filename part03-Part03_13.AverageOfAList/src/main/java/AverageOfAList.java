
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        for (Integer number : list) {
            sum += number;    
        }

        if (list.size() > 0) {
            System.out.println("Avarage: " + (1.0 * sum / list.size()));
        }

        scanner.close();
    }
}
