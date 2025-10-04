
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        

        System.out.println("Give a string:");

        String s = scan.nextLine();

        System.out.println("Give an integer:");

        Integer i = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");

        Double d = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");

        Boolean b = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + s);
        System.out.println("You gave the integer " + i);
        System.out.println("You gave the double " + d);
        System.out.println("You gave the boolean " + b);

        scan.close();

    }
}
