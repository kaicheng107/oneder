package stateless;

import entity.Player;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Local(PlayerController.class)
public class PlayerController implements PlayerControllerLocal {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public PlayerController() {
    }
    
    @Override
    public Player createNewPlayer(Player player) {
        em.persist(player);
        em.flush();
        
        return player;
    }
}
