package stateless;

import entity.Review;
import java.util.List;

public interface ReviewControllerLocal {
    
    public Review createNewReview(Review review);
    
    public List<Review> retrieveAllReviews();
    
    public void updateReview(Review review);
    
    public void deleteReview(Review review);
    
}
