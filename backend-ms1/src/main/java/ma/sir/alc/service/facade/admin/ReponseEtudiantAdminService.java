package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ReponseEtudiant;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ReponseEtudiantAdminService extends  IService<ReponseEtudiant,ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria>  {

    List<ReponseEtudiant> findByReponseId(Long id);
    int deleteByReponseId(Long id);
    List<ReponseEtudiant> findByQuizEtudiantId(Long id);
    int deleteByQuizEtudiantId(Long id);
    List<ReponseEtudiant> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);



}
