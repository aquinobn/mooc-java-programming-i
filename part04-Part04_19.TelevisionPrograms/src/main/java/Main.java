import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class
        
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            Integer duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram tvProgram = new TelevisionProgram(name, duration);
            programs.add(tvProgram);
        }

        System.out.println("Program's maximum duration? ");
        Integer duration = Integer.parseInt(scanner.nextLine());
        scanner.close();

        for (TelevisionProgram tvProgram : programs) {
            if (tvProgram.getDuration() > duration) {
                continue;
            }            
            System.out.println(tvProgram.getName()+", "+tvProgram.getDuration());
        }
    }
}
