package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ProfReview;
import ma.sir.alc.bean.history.ProfReviewHistory;
import ma.sir.alc.dao.criteria.core.ProfReviewCriteria;
import ma.sir.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.alc.dao.facade.core.ProfReviewDao;
import ma.sir.alc.dao.facade.history.ProfReviewHistoryDao;
import ma.sir.alc.dao.specification.core.ProfReviewSpecification;
import ma.sir.alc.service.facade.admin.ProfReviewAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.ProfAdminService ;
import ma.sir.alc.service.facade.admin.CoursAdminService ;


import java.util.List;
@Service
public class ProfReviewAdminServiceImpl extends AbstractServiceImpl<ProfReview,ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewDao,
ProfReviewHistoryDao> implements ProfReviewAdminService {



    public List<ProfReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<ProfReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ProfReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }

    public void configure() {
        super.configure(ProfReview.class,ProfReviewHistory.class, ProfReviewHistoryCriteria.class, ProfReviewSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private CoursAdminService coursService ;
    public ProfReviewAdminServiceImpl(ProfReviewDao dao, ProfReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}