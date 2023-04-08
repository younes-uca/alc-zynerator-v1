package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.EtatReponse;
import ma.sir.alc.bean.history.EtatReponseHistory;
import ma.sir.alc.dao.criteria.core.EtatReponseCriteria;
import ma.sir.alc.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.sir.alc.dao.facade.core.EtatReponseDao;
import ma.sir.alc.dao.facade.history.EtatReponseHistoryDao;
import ma.sir.alc.dao.specification.core.EtatReponseSpecification;
import ma.sir.alc.service.facade.admin.EtatReponseAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EtatReponseAdminServiceImpl extends AbstractServiceImpl<EtatReponse,EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseDao,
EtatReponseHistoryDao> implements EtatReponseAdminService {


    public EtatReponse findByReferenceEntity(EtatReponse t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EtatReponse.class,EtatReponseHistory.class, EtatReponseHistoryCriteria.class, EtatReponseSpecification.class);
    }

    public EtatReponseAdminServiceImpl(EtatReponseDao dao, EtatReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}