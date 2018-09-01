package stateless;

import entity.Player;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class PlayerController implements PlayerControllerLocal {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public PlayerController() {
    }
    
    @Override
    public Player createNewPlayer(Player player) {
        em.persist(player);
        em.flush();
        em.refresh(player);
        
        return player;
    }
    
    @Override
    public Player retrievePlayerById(Long playerId) {
        Query query = em.createQuery("SELECT p FROM Player p WHERE p.playerId = :playerId");
        query.setParameter("playerId", playerId);
        if (!query.getResultList().isEmpty()) {
            Player p = (Player) query.getSingleResult();
            return p;
        }
        return null;
    }
    
    @Override
    public Player retrievePlayerByUsername(String username) {
        Query query = em.createQuery("SELECT p FROM Player p WHERE p.username = :username");
        query.setParameter("username", username);
        if (!query.getResultList().isEmpty()) {
            Player p = (Player) query.getSingleResult();
            return p;
        }
        return null;
    }
    
    @Override
    public List<Player> retrieveAllPlayers() {
        Query query = em.createQuery("SELECT p FROM Player p");
        
        if (!query.getResultList().isEmpty()){
            return query.getResultList();
        }
        return null;
    }
    
    @Override
    public void updatePlayer(Player player) {
        em.merge(player);
    }
    
    @Override
    public void deletePlayer(Player player) {
        player = em.find(Player.class, player.getPlayerId());                
        em.merge(player);
        em.remove(player);
    }
}
