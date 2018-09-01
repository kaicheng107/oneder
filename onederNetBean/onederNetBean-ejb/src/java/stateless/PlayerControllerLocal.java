package stateless;

import entity.Player;
import java.util.List;
import javax.ejb.Local;

@Local
public interface PlayerControllerLocal {
    
    public Player createNewPlayer(Player player);
    
    public Player retrievePlayerById(Long playerId);
    
    public Player retrievePlayerByUsername(String username);
    
    public List<Player> retrieveAllPlayers();
    
    public void updatePlayer(Player player);
    
    public void deletePlayer(Player player);
}
