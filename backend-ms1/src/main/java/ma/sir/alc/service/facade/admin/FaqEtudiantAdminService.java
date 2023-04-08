package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.FaqEtudiant;
import ma.sir.alc.dao.criteria.core.FaqEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface FaqEtudiantAdminService extends  IService<FaqEtudiant,FaqEtudiantCriteria, FaqEtudiantHistoryCriteria>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
