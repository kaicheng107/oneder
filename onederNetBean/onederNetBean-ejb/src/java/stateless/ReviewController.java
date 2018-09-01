package stateless;

import entity.Review;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
@Local(ReviewController.class)
public class ReviewController implements ReviewControllerLocal {

    @PersistenceContext(unitName = "onederNetBean-ejbPU")
    private EntityManager em;

    public ReviewController() {
    }
    
    @Override
    public Review createNewReview(Review review) {
        em.persist(review);
        em.flush();
        em.refresh(review);
        
        return review;
    }
    
    @Override
    public List<Review> retrieveAllReviews() {
        Query query = em.createQuery("SELECT r FROM Review r");
        
        if (!query.getResultList().isEmpty()){
            return query.getResultList();
        }
        return null;
    }
    
    @Override
    public void updateReview(Review review) {
        em.merge(review);
    }
    
    @Override
    public void deleteReview(Review review) {
        review = em.find(Review.class, review.getReviewId());                
        em.merge(review);
        em.remove(review);
    }
}
