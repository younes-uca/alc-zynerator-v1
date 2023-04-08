package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ReclamationEtudiant;
import ma.sir.alc.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ReclamationEtudiantAdminService extends  IService<ReclamationEtudiant,ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria>  {

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);



}
