package stateless;

import entity.Location;
import exception.NotFoundException;
import java.util.List;

public interface LocationControllerLocal {
    
    public Location createNewLocation(Location location);

    public void retrieveLocationById(int i) throws NotFoundException;
    
    public List<Location> retrieveAllLocations();
    
    public void updateLocation(Location location);
    
    public void deleteLocation(Location location);
}
