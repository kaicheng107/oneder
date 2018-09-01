/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.restful.datamodel;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Kai Cheng
 */
@XmlType(name = "getPlayerRsp", propOrder = {
    "playerId",
    "name",
    "username",
    "email",
    "phoneNumber",
    "aggregatedRating"
})
public class GetPlayerRsp {
    private Long playerId;
    private String name;            // Retrieved from OneService App
    private String username;        // Retrieved from OneService App
    private String email;           // Retrieved from OneService App
    private int phoneNumber;     // Retrieved from OneService App
    private double aggregatedRating;

    public GetPlayerRsp() {
    }

    public GetPlayerRsp(Long playerId, String name, String username, String email, int phoneNumber, double aggregatedRating) {
        this.playerId = playerId;
        this.name = name;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.aggregatedRating = aggregatedRating;
    }
    
    
    /**
     * @return the playerId
     */
    public Long getPlayerId() {
        return playerId;
    }

    /**
     * @param playerId the playerId to set
     */
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the aggregatedRating
     */
    public double getAggregatedRating() {
        return aggregatedRating;
    }

    /**
     * @param aggregatedRating the aggregatedRating to set
     */
    public void setAggregatedRating(double aggregatedRating) {
        this.aggregatedRating = aggregatedRating;
    }
    
    
}
