
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();        

        ArrayList<Statistic> stats = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                Statistic stat = new Statistic(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                stats.add(stat);
            }
            System.out.println("File loaded!");
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Team: ");
        String team = scan.nextLine();
        scan.close();

        int games = 0;
        for (Statistic stat: stats) {
            if (stat.getHomeTeam().equals(team)) {
                games++;
            }
            if (stat.getVisitingTeam().equals(team)) {
                games++;
            }
        }
        System.out.println("Games: "+games);
        int wins = getWins(stats, team);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+ (games-wins));

    }

    public static int getWins(ArrayList<Statistic> stats, String team) {
        int wins = 0;
        for (Statistic stat: stats) {
            if (stat.returnWinner().equals(team)) {                
                wins++;
            }
        }
        return wins;
    }

}
