
package soccer.play;

import java.time.LocalDateTime;
import java.util.ArrayList;
import soccer.event.GameEvent;
import soccer.event.Kickoff;


/**
 *
 * @author mont_
 */
public class Game implements IDisplayDataItem  {
    
    private Team homeTeam;
    private Team awayTeam;
    private GameEvent[] events;
    private LocalDateTime theDataTime;
    
    private boolean detailAvailable = false;
    private int id = 0;
    private String detailType = "Game";

    public Game(Team homeTeam, Team awayTeam, LocalDateTime theDataTime) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.theDataTime = theDataTime;
    }
    
    public void playGame(){
        ArrayList<GameEvent> eventList = new ArrayList();
        Team currTeam;
        Player currPlayer;
        GameEvent currEvent = new Kickoff();
        currEvent.setBallPos(50);
        
        currEvent.setTheTeam(Math.random()>0.5?homeTeam: awayTeam);
        
       /* currEvent.setThePlayer(currEvent.getTheTeam().
                //getPlayerArray()[(Math.random()* this.homeTeam.)]
               
                );*/
        
        
        
    }
    
    @Override
    public boolean isDetailAvailable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDisplayDetail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDetailType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
