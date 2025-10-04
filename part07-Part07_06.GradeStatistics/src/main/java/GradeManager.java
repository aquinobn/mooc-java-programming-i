import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Integer> points;          
    private final int MINIMUM_PASSING_GRADE = 50;


    public GradeManager() {       
        this.points = new ArrayList<>();
    }
    
    public boolean addPoints(int pts) {
        if (pts < 0 || pts > 100) {
            return false;
        }   
        points.add(pts);
        return true;
    }

    public boolean removePoint(int ptsIndex) {
        if (ptsIndex < 0 || ptsIndex > points.size() - 1) {
            return false;
        }
        points.remove(ptsIndex);
        return true;
    }

    public double average() {
        return points.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(-1.0);
        }

    public double averagePassGrade() {
        if (points.isEmpty()) {
            return -1.0;
        }
        double average = points.stream()
            .filter(score -> score >= MINIMUM_PASSING_GRADE)
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0); // <-- Devuelve 0.0 si el stream filtrado está vacío.
        
        return average;        
    }

    public double passPercentage() {
        if (points.isEmpty()) {
            return -1.0;
        }       

        long passingParticipants = points.stream()
            .filter(score -> score >= MINIMUM_PASSING_GRADE)
            .count();       

        long totalParticipants = points.size();        
        
        return 100.0 * passingParticipants / totalParticipants;
    }

    public String[] gradeDistribution() {
        String[] gradesDistribution = {"","","","","",""};  

        for (Integer pts : points) {
            int grade = calculateGrade(pts);
            gradesDistribution[grade] += "*";             
        }

        return gradesDistribution;                

    }
    private int calculateGrade(int pts) {        
        if (pts < 50) {
            return 0;
        }
        else if (pts < 60) {
            return 1;
        }
        else if (pts < 70) {
            return 2;
        }
        else if (pts < 80) {
            return 3;
        }
        else if (pts < 90) {
            return 4;
        }
        else {
            return 5;
        }
    }

    private void printGradeDistribution(String[] gradesDistribution) {
        for (int index = gradesDistribution.length - 1; index >= 0; index--) {
            System.out.println(index+": "+gradesDistribution[index]);
        }
    }    

}
