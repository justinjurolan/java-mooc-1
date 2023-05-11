
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Getting the file name
        System.out.println("File: ");
        String fileName = scan.nextLine();
        // Processing and storing the file
        ArrayList<Team> matches = storeRecordsFromFile(fileName);
        // Get the team name
        System.out.println("Team: ");
        String teamName = scan.nextLine();
        // Output the team details
        int gamesPlayed = gamesPlayed(matches,teamName);
        int teamWins = gameTeamWins(matches,teamName);
        int teamLosses = gameTeamLosses(matches,teamName);
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + teamWins);
        System.out.println("Losses: " + teamLosses);
    }
    
    public static int gameTeamLosses(ArrayList<Team> match, String teamName) {
        int teamLosses = 0;
        for (Team team : match) {
            if (team.getHomeTeam().contains(teamName) && team.getHomeTeamPoints() < team.getVisitingTeamPoints()) {
                teamLosses++;
            }
            
            if (team.getVisitingTeam().contains(teamName) && team.getVisitingTeamPoints() < team.getHomeTeamPoints()) {
                teamLosses++;
            }
        }
        return teamLosses;
    }
    
    
    public static int gameTeamWins(ArrayList<Team> match, String teamName) {
        int teamWins = 0;
        for (Team team : match) {
            if (team.getHomeTeam().contains(teamName) && team.getHomeTeamPoints() > team.getVisitingTeamPoints()) {
                teamWins++;
            }
            
            if (team.getVisitingTeam().contains(teamName) && team.getVisitingTeamPoints() > team.getHomeTeamPoints()) {
                teamWins++;
            }
        }
        return teamWins;
        
    }
    
    public static int gamesPlayed (ArrayList<Team> match, String teamName) {
        int gamesPlayed = 0;
        for (Team team : match) {
            if (team.getHomeTeam().contains(teamName) || team.getVisitingTeam().contains(teamName)) {
                gamesPlayed++;
            }
        }
        return gamesPlayed;
    }
    
    public static ArrayList<Team> storeRecordsFromFile(String file) {
        ArrayList<Team> matches = new ArrayList<>();
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String fileLine = readFile.nextLine();
                if (fileLine.isEmpty()) {
                    continue;
                }
                String[] fileCSV = fileLine.split(",");
                String homeTeam = fileCSV[0];
                String visitingTeam = fileCSV[1];
                int homeTeamPoints = Integer.valueOf(fileCSV[2]);
                int visitingTeamPoints = Integer.valueOf(fileCSV[3]);
                matches.add(new Team(homeTeam,visitingTeam,homeTeamPoints,visitingTeamPoints));
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return matches;
    }

}
