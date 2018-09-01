/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import entity.Location;
import exception.LocationNotFoundException;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import stateless.LocationControllerLocal;

@Singleton
@LocalBean
@Startup

public class DataInitializationSessionBean {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;
    
    @EJB
    private LocationControllerLocal locationControllerLocal;
    
    public DataInitializationSessionBean()
    {
    }
    
    @PostConstruct
    public void postConstruct()
    {
        try
        {
            locationControllerLocal.retrieveLocationById(1);
        }
        catch(LocationNotFoundException ex)
        {
            initializeData();
        }
    }
    
    private void initializeData() {
        locationControllerLocal.createNewLocation(new Location("Pek Kio CC","Community Centre", "",21,"Gloucester Road",219458,103.8513738,1.313058658));
        locationControllerLocal.createNewLocation(new Location("Potong Pasir CC","Community Club", "",6,"Potong Pasir Avenue 2",358361,103.8670368,1.332535908));
        locationControllerLocal.createNewLocation(new Location("Punggol 21 CC","Community Club", "",80,"Punggol Field",828815,103.9134641,1.393606243));
        locationControllerLocal.createNewLocation(new Location("Punggol CC","Community Club", "",3,"Hougang Avenue 6",538808,103.8918153,1.374378823));
        locationControllerLocal.createNewLocation(new Location("Punggol Park CC","Community Centre", "",458,"Hougang Avenue 10",530458,103.8962529,1.377734447));
        locationControllerLocal.createNewLocation(new Location("Punggol Vista CC","Community Centre", "",602,"Punggol Central",820602,103.9072886,1.403284292));
        locationControllerLocal.createNewLocation(new Location("Queenstown CC","Community Centre", "",365,"Commonwealth Avenue",149732,103.8013051,1.299150242));
        locationControllerLocal.createNewLocation(new Location("Rivervale CC","Community Centre", "",193,"Rivervale Drive",540193,103.901775,1.393628318));
        locationControllerLocal.createNewLocation(new Location("Sembawang CC","Community Club","",2125,"Sembawang Road",758528,103.8287832,1.451681526));
        locationControllerLocal.createNewLocation(new Location("Sengkang CC","Community Club","Sengkang Community Hub",2,"Sengkang Square",545025,103.8939061,1.392785593));
    }
}
