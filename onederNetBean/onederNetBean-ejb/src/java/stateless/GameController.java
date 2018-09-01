package stateless;

import entity.Game;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class GameController implements GameControllerLocal {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public GameController() {
    }
    
    @Override
    public Game createNewGame(Game game) {
        em.persist(game);
        em.flush();
        em.refresh(game);
        
        return game;
    }
    
    @Override
    public List<Game> retrieveAllGames() {
        Query query = em.createQuery("SELECT g FROM Game g");
        
        if (!query.getResultList().isEmpty()){
            return query.getResultList();
        }
        return null;
    }    
    
    @Override
    public void updateGame(Game game) {
        em.merge(game);
    }
    
    @Override
    public void deleteGame(Game game) {
        game = em.find(Game.class, game.getGameId());                
        em.merge(game);
        em.remove(game);
    }

}
