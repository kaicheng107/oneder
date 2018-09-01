package stateless;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ReviewController implements ReviewControllerLocal {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public ReviewController() {
    }
    
    
}
