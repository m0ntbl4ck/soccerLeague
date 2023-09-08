
package soccer.play;

import soccer.event.GameEvent;

/**
 *
 * @author mont_
 */
public class GameResult {
     
   private final Team homeTeam;
   private final Team awayTeam;
   private Team winner;
   private int homeTeamGoals;
   private int awayTeamGoals;
   private boolean isDrawn;

    public GameResult(Game currGame) {
        this.homeTeam = currGame.getHomeTeam();
        this.awayTeam = currGame.getAwayTeam();
        getScore(currGame);
        if(homeTeamGoals == awayTeamGoals){
            this.isDrawn = true;
        }else if (homeTeamGoals > awayTeamGoals){
            this.winner = this.homeTeam;
        } else{
            this.winner = this.awayTeam;
        }
                
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }
    private void getScore(Game currGame){
        for(GameEvent currEvent: currGame.getEvents()){
            if(currEvent.getTheTeam() == currGame.getHomeTeam()){
                this.homeTeamGoals++;
            } else{
                this.awayTeamGoals++;
            }
        }
    }
            
            
            
    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public int getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(int homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public int getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(int awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public boolean isIsDrawn() {
        return isDrawn;
    }

    public void setIsDrawn(boolean isDrawn) {
        this.isDrawn = isDrawn;
    }
   
   
   
}
