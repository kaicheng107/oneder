package stateless;

import entity.Location;
import exception.LocationNotFoundException;

public interface LocationControllerLocal {
    
    public Location createNewLocation(Location location);

    public void retrieveLocationById(int i) throws LocationNotFoundException;
    
}
