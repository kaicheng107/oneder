package stateless;

import entity.Player;
import javax.ejb.Local;

@Local
public interface PlayerControllerLocal {
    
    public Player createNewPlayer(Player player);
}
