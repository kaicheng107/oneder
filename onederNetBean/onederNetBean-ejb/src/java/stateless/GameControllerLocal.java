package stateless;

import entity.Game;
import java.util.List;
import javax.ejb.Local;

public interface GameControllerLocal {
    
    public Game createNewGame(Game game);
    
    public List<Game> retrieveAllGames();
    
    public void updateGame(Game game);
    
    public void deleteGame(Game game);
}
