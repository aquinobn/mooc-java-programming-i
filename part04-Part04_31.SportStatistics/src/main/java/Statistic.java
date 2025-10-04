public class Statistic {
    private String homeTeam;
    private String visitingTeam;
    private Integer homeTeamPoints;
    private Integer visitingTeamPoints;

    public Statistic (String ht, String vt, Integer htp, Integer vtp) {
        this.homeTeam = ht;
        this.visitingTeam = vt;
        this.homeTeamPoints = htp;
        this.visitingTeamPoints = vtp;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public Integer getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public void setHomeTeamPoints(Integer homeTeamPoints) {
        this.homeTeamPoints = homeTeamPoints;
    }

    public Integer getVisitingTeamPoints() {
        return visitingTeamPoints;
    }

    public void setVisitingTeamPoints(Integer visitingTeamPoints) {
        this.visitingTeamPoints = visitingTeamPoints;
    }  

    public String returnWinner() {
        if (this.homeTeamPoints > this.visitingTeamPoints) {
            return this.homeTeam;
        } else if (this.homeTeamPoints < this.visitingTeamPoints) {
            return this.visitingTeam;
        } else {
            return "draw";
        }
    }

}
