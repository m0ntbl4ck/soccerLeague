
package soccer.event;

/**
 *
 * @author mont_
 */
public class Kickout extends GameEvent{

    public Kickout() {
    }

    @Override
    public String toString() {
        return "Salvados. El balon sale por Fuera ";
    }
    
    
    @Override
    public GameEvent[] getNextEvents() {
       GameEvent theEvent[] = {new GainPossession(), new ReceivePass()};
       return theEvent;
    }

    @Override
    public boolean changePlayer() {
      return true;
    }

    @Override
    public boolean changeTeam() {
       return true;
    }
    
    public void setBalPos(int ballPos){
        super.ballPos = 95;
    }
}
