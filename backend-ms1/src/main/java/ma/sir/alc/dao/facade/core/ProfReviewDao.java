package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.ProfReview;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProfReviewDao extends AbstractRepository<ProfReview,Long>  {

    List<ProfReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<ProfReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ProfReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);

}
