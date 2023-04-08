package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ProfReview;
import ma.sir.alc.dao.criteria.core.ProfReviewCriteria;
import ma.sir.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ProfReviewAdminService extends  IService<ProfReview,ProfReviewCriteria, ProfReviewHistoryCriteria>  {

    List<ProfReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<ProfReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ProfReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
