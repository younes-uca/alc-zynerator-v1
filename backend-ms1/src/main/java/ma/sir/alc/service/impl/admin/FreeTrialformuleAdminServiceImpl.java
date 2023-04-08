package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.FreeTrialformule;
import ma.sir.alc.bean.history.FreeTrialformuleHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialformuleCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.sir.alc.dao.facade.core.FreeTrialformuleDao;
import ma.sir.alc.dao.facade.history.FreeTrialformuleHistoryDao;
import ma.sir.alc.dao.specification.core.FreeTrialformuleSpecification;
import ma.sir.alc.service.facade.admin.FreeTrialformuleAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.InscriptionAdminService ;


import java.util.List;
@Service
public class FreeTrialformuleAdminServiceImpl extends AbstractServiceImpl<FreeTrialformule,FreeTrialformuleHistory, FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria, FreeTrialformuleDao,
FreeTrialformuleHistoryDao> implements FreeTrialformuleAdminService {


    public FreeTrialformule findByReferenceEntity(FreeTrialformule t){
        return  dao.findByCode(t.getCode());
    }

    public List<FreeTrialformule> findByInscriptionId(Long id){
        return dao.findByInscriptionId(id);
    }
    public int deleteByInscriptionId(Long id){
        return dao.deleteByInscriptionId(id);
    }

    public void configure() {
        super.configure(FreeTrialformule.class,FreeTrialformuleHistory.class, FreeTrialformuleHistoryCriteria.class, FreeTrialformuleSpecification.class);
    }

    @Autowired
    private InscriptionAdminService inscriptionService ;
    public FreeTrialformuleAdminServiceImpl(FreeTrialformuleDao dao, FreeTrialformuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}