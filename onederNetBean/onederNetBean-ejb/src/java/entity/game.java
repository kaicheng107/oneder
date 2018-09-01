package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Game implements Serializable {    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    private int creatorId;
    private int locationId;
    private String gameType;
    private int minPlayers;
    private int maxPlayers;
    @Temporal(TemporalType.TIME)
    private Date startTime;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.TIME)
    private Date endTime;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeOfCreation;    // Timestamp of game creation
    
    @OneToMany(cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<Player> players;    

    public Game() {
    }
    
    
    
    // For current player number use array size    
    public int getCurentPlayerNumber() {
        return players.size();
    }

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }
    
    /**
     * @return the creatorId
     */
    public int getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId the creatorId to set
     */
    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return the locationId
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * @param locationId the locationId to set
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    /**
     * @return the gameType
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * @param gameType the gameType to set
     */
    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    /**
     * @return the minPlayers
     */
    public int getMinPlayers() {
        return minPlayers;
    }

    /**
     * @param minPlayers the minPlayers to set
     */
    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    /**
     * @return the maxPlayers
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * @param maxPlayers the maxPlayers to set
     */
    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    /**
     * @return the timeOfCreation
     */
    public Date getTimeOfCreation() {
        return timeOfCreation;
    }

    /**
     * @param timeOfCreation the timeOfCreation to set
     */
    public void setTimeOfCreation(Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    /**
     * @return the players
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    
    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gameId != null ? gameId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.gameId == null && other.gameId != null) || (this.gameId != null && !this.gameId.equals(other.gameId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Game[ id=" + gameId + " ]";
    }
    
}
