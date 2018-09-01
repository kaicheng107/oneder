package stateless;

import entity.Location;
import exception.NotFoundException;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class LocationController implements LocationControllerLocal {
    
    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public LocationController() {
    }
    
    @Override
    public Location createNewLocation(Location location) {
        em.persist(location);
        em.flush();
        em.refresh(location);
        
        return location;
    }
    
    @Override
    public void retrieveLocationById(int i) throws NotFoundException {
        throw new NotFoundException();
    }
    
    public Location retrieveLocationById(Long locationId) {
        Query query = em.createQuery("SELECT loc FROM Location loc WHERE loc.locationId = :locationId");
        query.setParameter("locationId", locationId);
        if (!query.getResultList().isEmpty()) {
            Location loc = (Location) query.getSingleResult();
            return loc;
        }
        return null;
    }
    
        
    @Override
    public List<Location> retrieveAllLocations() {
        Query query = em.createQuery("SELECT loc FROM Location loc");
        
        if (!query.getResultList().isEmpty()){
            return query.getResultList();
        }
        return null;
    }
        
    @Override
    public void updateLocation(Location location) {
        em.merge(location);
    }
    
    @Override
    public void deleteLocation(Location location) {
        location = em.find(Location.class, location.getLocationId());                
        em.merge(location);
        em.remove(location);
    }    
}
