package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.EtatInscription;
import ma.sir.alc.bean.history.EtatInscriptionHistory;
import ma.sir.alc.dao.criteria.core.EtatInscriptionCriteria;
import ma.sir.alc.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.sir.alc.dao.facade.core.EtatInscriptionDao;
import ma.sir.alc.dao.facade.history.EtatInscriptionHistoryDao;
import ma.sir.alc.dao.specification.core.EtatInscriptionSpecification;
import ma.sir.alc.service.facade.admin.EtatInscriptionAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatInscriptionAdminServiceImpl extends AbstractServiceImpl<EtatInscription,EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionDao,
EtatInscriptionHistoryDao> implements EtatInscriptionAdminService {


    public EtatInscription findByReferenceEntity(EtatInscription t){
        return  dao.findByLibelle(t.getLibelle());
    }


    public void configure() {
        super.configure(EtatInscription.class,EtatInscriptionHistory.class, EtatInscriptionHistoryCriteria.class, EtatInscriptionSpecification.class);
    }

    public EtatInscriptionAdminServiceImpl(EtatInscriptionDao dao, EtatInscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}