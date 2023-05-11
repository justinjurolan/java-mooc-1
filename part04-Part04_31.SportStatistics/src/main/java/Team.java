/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    public Team (String home, String visiting, int homePoints, int visitingPoints) {
        this.homeTeam = home;
        this.visitingTeam = visiting;
        this.homeTeamPoints = homePoints;
        this.visitingTeamPoints = visitingPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }
    
    public int getVisitingTeamPoints() {
        return this.visitingTeamPoints;
    }
    
    @Override
    public String toString() {
        return this.homeTeam + ", " + this.visitingTeam + ", " + this.homeTeamPoints + ", " + this.visitingTeamPoints;
    }
    
    
}
