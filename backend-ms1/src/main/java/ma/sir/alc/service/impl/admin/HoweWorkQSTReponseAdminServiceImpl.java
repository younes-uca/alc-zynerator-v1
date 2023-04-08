package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.HoweWorkQSTReponse;
import ma.sir.alc.bean.history.HoweWorkQSTReponseHistory;
import ma.sir.alc.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.sir.alc.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.sir.alc.dao.facade.core.HoweWorkQSTReponseDao;
import ma.sir.alc.dao.facade.history.HoweWorkQSTReponseHistoryDao;
import ma.sir.alc.dao.specification.core.HoweWorkQSTReponseSpecification;
import ma.sir.alc.service.facade.admin.HoweWorkQSTReponseAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.HomeWorkQuestionAdminService ;
import ma.sir.alc.service.facade.admin.EtatReponseAdminService ;


import java.util.List;
@Service
public class HoweWorkQSTReponseAdminServiceImpl extends AbstractServiceImpl<HoweWorkQSTReponse,HoweWorkQSTReponseHistory, HoweWorkQSTReponseCriteria, HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseDao,
HoweWorkQSTReponseHistoryDao> implements HoweWorkQSTReponseAdminService {


    public HoweWorkQSTReponse findByReferenceEntity(HoweWorkQSTReponse t){
        return  dao.findByRef(t.getRef());
    }

    public List<HoweWorkQSTReponse> findByEtatReponseId(Long id){
        return dao.findByEtatReponseId(id);
    }
    public int deleteByEtatReponseId(Long id){
        return dao.deleteByEtatReponseId(id);
    }
    public List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id){
        return dao.findByHomeWorkQuestionId(id);
    }
    public int deleteByHomeWorkQuestionId(Long id){
        return dao.deleteByHomeWorkQuestionId(id);
    }

    public void configure() {
        super.configure(HoweWorkQSTReponse.class,HoweWorkQSTReponseHistory.class, HoweWorkQSTReponseHistoryCriteria.class, HoweWorkQSTReponseSpecification.class);
    }

    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    @Autowired
    private EtatReponseAdminService etatReponseService ;
    public HoweWorkQSTReponseAdminServiceImpl(HoweWorkQSTReponseDao dao, HoweWorkQSTReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}