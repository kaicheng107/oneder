package stateless;

import entity.Location;
import exception.LocationNotFoundException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Local(LocationController.class)
public class LocationController implements LocationControllerLocal {
    
    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public LocationController() {
    }
    
    @Override
    public Location createNewLocation(Location location) {
        em.persist(location);
        em.flush();
        
        return location;
    }

    @Override
    public void retrieveLocationById(int i) throws LocationNotFoundException {
        throw new LocationNotFoundException();
    }
}
