package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.GroupeEtudiant;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface GroupeEtudiantAdminService extends  IService<GroupeEtudiant,GroupeEtudiantCriteria, GroupeEtudiantHistoryCriteria>  {

    List<GroupeEtudiant> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<GroupeEtudiant> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<GroupeEtudiant> findByProfId(Long id);
    int deleteByProfId(Long id);



}
