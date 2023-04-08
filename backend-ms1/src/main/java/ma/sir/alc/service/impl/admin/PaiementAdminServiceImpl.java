package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Paiement;
import ma.sir.alc.bean.history.PaiementHistory;
import ma.sir.alc.dao.criteria.core.PaiementCriteria;
import ma.sir.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.alc.dao.facade.core.PaiementDao;
import ma.sir.alc.dao.facade.history.PaiementHistoryDao;
import ma.sir.alc.dao.specification.core.PaiementSpecification;
import ma.sir.alc.service.facade.admin.PaiementAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.GroupeEtudiantAdminService ;
import ma.sir.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class PaiementAdminServiceImpl extends AbstractServiceImpl<Paiement,PaiementHistory, PaiementCriteria, PaiementHistoryCriteria, PaiementDao,
PaiementHistoryDao> implements PaiementAdminService {



    public List<Paiement> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<Paiement> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }

    public void configure() {
        super.configure(Paiement.class,PaiementHistory.class, PaiementHistoryCriteria.class, PaiementSpecification.class);
    }

    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;
    @Autowired
    private ProfAdminService profService ;
    public PaiementAdminServiceImpl(PaiementDao dao, PaiementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}