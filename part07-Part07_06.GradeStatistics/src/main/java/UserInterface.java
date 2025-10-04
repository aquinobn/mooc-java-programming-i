import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private GradeManager gradeManager;    

    public UserInterface(Scanner scanner, GradeManager gradeManager) {
        this.scanner = scanner;
        this.gradeManager = gradeManager;
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            gradeManager.addPoints(value);
        }

        System.out.println("Point average (all): " + gradeManager.average());
        System.out.println("Point average (passing): "+ gradeManager.averagePassGrade());
        System.out.println("Pass percentage: "+gradeManager.passPercentage());

        String[] gradeDistribution = gradeManager.gradeDistribution();
        String formatedGradeDistribution = formatGradeDistribution(gradeDistribution);

        System.out.println("Grade distribution:\n"+formatedGradeDistribution);
        
    }

    private String formatGradeDistribution(String[] grades) {
        String output = "";
        if (grades.length == 0) {
            return output;
        }
        for (int i = grades.length -1 ; i >= 0; i--) {
            output += i+": "+grades[i]+"\n";
        }
        return output;
    }
    
}
