package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.NiveauEtude;
import ma.sir.alc.bean.history.NiveauEtudeHistory;
import ma.sir.alc.dao.criteria.core.NiveauEtudeCriteria;
import ma.sir.alc.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.sir.alc.dao.facade.core.NiveauEtudeDao;
import ma.sir.alc.dao.facade.history.NiveauEtudeHistoryDao;
import ma.sir.alc.dao.specification.core.NiveauEtudeSpecification;
import ma.sir.alc.service.facade.admin.NiveauEtudeAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class NiveauEtudeAdminServiceImpl extends AbstractServiceImpl<NiveauEtude,NiveauEtudeHistory, NiveauEtudeCriteria, NiveauEtudeHistoryCriteria, NiveauEtudeDao,
NiveauEtudeHistoryDao> implements NiveauEtudeAdminService {


    public NiveauEtude findByReferenceEntity(NiveauEtude t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(NiveauEtude.class,NiveauEtudeHistory.class, NiveauEtudeHistoryCriteria.class, NiveauEtudeSpecification.class);
    }

    public NiveauEtudeAdminServiceImpl(NiveauEtudeDao dao, NiveauEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}