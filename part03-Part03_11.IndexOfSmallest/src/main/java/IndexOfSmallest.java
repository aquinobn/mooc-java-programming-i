
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> aux = new ArrayList<>();        

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        for (Integer number : list) {
            aux.add(number);
        }
        
        aux.sort(null);
        Integer search = aux.get(0);   
        System.out.println("Smallest number: " + search);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == search) {
                System.out.println(search + " is at index " + i);
            }
        }

        scanner.close();        
    }
}
