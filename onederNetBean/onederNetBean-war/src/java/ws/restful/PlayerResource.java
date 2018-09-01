/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.restful;

import entity.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import stateless.PlayerControllerLocal;
import ws.restful.datamodel.GetPlayerRsp;
import ws.restful.datamodel.ErrorRsp;
/**
 * REST Web Service
 *
 * @author Kai Cheng
 */
@Path("player")
public class PlayerResource {

    PlayerControllerLocal playerController = lookupPlayerControllerLocal();

    @Context
    private UriInfo context;
    

    /**
     * Creates a new instance of PlayerResource
     */
    public PlayerResource() {
    }

    /**
     * Retrieves representation of an instance of ws.restful.PlayerResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPlayer() {
        try{
            Player player = new Player();
            long id = 2;
            
            player = playerController.retrievePlayerById(id);
            GetPlayerRsp getPlayerRsp = new GetPlayerRsp(player.getPlayerId(),player.getName(),player.getUsername(),player.getEmail(),player.getPhoneNumber(),player.getAggregatedRating());
            
            return Response.status(Status.OK).entity(getPlayerRsp).build();
        }catch(Exception ex){
            ErrorRsp errorRsp = new ErrorRsp(ex.getMessage());
            
            return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorRsp).build();
        }
    }

    private PlayerControllerLocal lookupPlayerControllerLocal() {
        try {
            javax.naming.Context c = new InitialContext();
            return (PlayerControllerLocal) c.lookup("java:global/onederNetBean/onederNetBean-ejb/PlayerController!stateless.PlayerControllerLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }


}
