package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Review implements Serializable {    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewId;
    private int reviewerId;
    private int revieweeId;
    private int gameId;
    private String comments;
    private int gameRating;
    private int skillRating;
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeOfCreation;    // Timestamp of review creation
    
        public Review() {
    }

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    
    /**
     * @return the reviewerId
     */
    public int getReviewerId() {
        return reviewerId;
    }

    /**
     * @param reviewerId the reviewerId to set
     */
    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
    }

    /**
     * @return the revieweeId
     */
    public int getRevieweeId() {
        return revieweeId;
    }

    /**
     * @param revieweeId the revieweeId to set
     */
    public void setRevieweeId(int revieweeId) {
        this.revieweeId = revieweeId;
    }

    /**
     * @return the gameId
     */
    public int getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the gameRating
     */
    public int getGameRating() {
        return gameRating;
    }

    /**
     * @param gameRating the gameRating to set
     */
    public void setGameRating(int gameRating) {
        this.gameRating = gameRating;
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
     * @return the skillRating
     */
    public int getSkillRating() {
        return skillRating;
    }

    /**
     * @param skillRating the skillRating to set
     */
    public void setSkillRating(int skillRating) {
        this.skillRating = skillRating;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reviewId != null ? reviewId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.reviewId == null && other.reviewId != null) || (this.reviewId != null && !this.reviewId.equals(other.reviewId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Review[ id=" + reviewId + " ]";
    }
    
}
