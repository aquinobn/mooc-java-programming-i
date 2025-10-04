
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer origin = 0, target = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        System.out.println("From where?");
        origin = Integer.valueOf(scanner.nextLine());

        System.out.println("To where?");
        target = Integer.valueOf(scanner.nextLine());

        for (int i = origin ; i <= target; i++) {
            System.out.println(numbers.get(i));
        }

        scanner.close();
    }
}
