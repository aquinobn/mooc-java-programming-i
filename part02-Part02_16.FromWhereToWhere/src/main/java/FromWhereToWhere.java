
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        Integer target = Integer.parseInt(scanner.nextLine());

        System.out.println("Where from?");
        Integer origin = Integer.parseInt(scanner.nextLine());

        if (origin > target) {
            scanner.close();
            return;
        }

        for (int i = origin ; i <= target ; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
