package stateless;

<<<<<<< HEAD
import javax.ejb.Local;
import javax.ejb.Local;
=======
import entity.Review;
import java.util.List;
>>>>>>> master

@Local
public interface ReviewControllerLocal {
    
    public Review createNewReview(Review review);
    
    public List<Review> retrieveAllReviews();
    
    public void updateReview(Review review);
    
    public void deleteReview(Review review);
    
}
