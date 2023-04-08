package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Paiement;
import ma.sir.alc.dao.criteria.core.PaiementCriteria;
import ma.sir.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria, PaiementHistoryCriteria>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);



}
