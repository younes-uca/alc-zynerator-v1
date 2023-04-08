package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialDetail;
import ma.sir.alc.bean.history.FreeTrialDetailHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialDetailDao;
import ma.sir.alc.dao.facade.history.FreeTrialDetailHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialDetailSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialDetailAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;
import ma.sir.alc.service.facade.admin.FreeTrialAdminService ;


import java.util.List;
@Service
public class FreeTrialDetailAdminServiceImpl extends AbstractServiceImpl<FreeTrialDetail,FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailDao,
FreeTrialDetailHistoryDao> implements FreeTrialDetailAdminService {



    public List<FreeTrialDetail> findByFreeTrialId(Long id){
        return dao.findByFreeTrialId(id);
    }
    public int deleteByFreeTrialId(Long id){
        return dao.deleteByFreeTrialId(id);
    }
    public List<FreeTrialDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(FreeTrialDetail.class,FreeTrialDetailHistory.class, FreeTrialDetailHistoryCriteria.class, FreeTrialDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private FreeTrialAdminService freeTrialService ;
    public FreeTrialDetailAdminServiceImpl(FreeTrialDetailDao dao, FreeTrialDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}