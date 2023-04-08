package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtudiantReview;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EtudiantReviewDao extends AbstractRepository<EtudiantReview,Long>  {

    List<EtudiantReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);

}
