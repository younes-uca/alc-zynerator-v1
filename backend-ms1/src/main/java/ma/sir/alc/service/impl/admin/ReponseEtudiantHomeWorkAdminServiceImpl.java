package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;
import ma.sir.alc.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.alc.dao.facade.core.ReponseEtudiantHomeWorkDao;
import ma.sir.alc.dao.facade.history.ReponseEtudiantHomeWorkHistoryDao;
import ma.sir.alc.dao.specification.core.ReponseEtudiantHomeWorkSpecification;
import ma.sir.alc.service.facade.admin.ReponseEtudiantHomeWorkAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.HoweWorkQSTReponseAdminService ;
import ma.sir.alc.service.facade.admin.HomeWorkQuestionAdminService ;
import ma.sir.alc.service.facade.admin.HomeWorkEtudiantAdminService ;


import java.util.List;
@Service
public class ReponseEtudiantHomeWorkAdminServiceImpl extends AbstractServiceImpl<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkHistory, ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkDao,
ReponseEtudiantHomeWorkHistoryDao> implements ReponseEtudiantHomeWorkAdminService {



    public List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id){
        return dao.findByHoweWorkQSTReponseId(id);
    }
    public int deleteByHoweWorkQSTReponseId(Long id){
        return dao.deleteByHoweWorkQSTReponseId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id){
        return dao.findByHomeWorkEtudiantId(id);
    }
    public int deleteByHomeWorkEtudiantId(Long id){
        return dao.deleteByHomeWorkEtudiantId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id){
        return dao.findByHomeWorkQuestionId(id);
    }
    public int deleteByHomeWorkQuestionId(Long id){
        return dao.deleteByHomeWorkQuestionId(id);
    }

    public void configure() {
        super.configure(ReponseEtudiantHomeWork.class,ReponseEtudiantHomeWorkHistory.class, ReponseEtudiantHomeWorkHistoryCriteria.class, ReponseEtudiantHomeWorkSpecification.class);
    }

    @Autowired
    private HoweWorkQSTReponseAdminService howeWorkQSTReponseService ;
    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    @Autowired
    private HomeWorkEtudiantAdminService homeWorkEtudiantService ;
    public ReponseEtudiantHomeWorkAdminServiceImpl(ReponseEtudiantHomeWorkDao dao, ReponseEtudiantHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}