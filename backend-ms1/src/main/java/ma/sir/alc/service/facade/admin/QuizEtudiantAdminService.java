package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.QuizEtudiant;
import ma.sir.alc.dao.criteria.core.QuizEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface QuizEtudiantAdminService extends  IService<QuizEtudiant,QuizEtudiantCriteria, QuizEtudiantHistoryCriteria>  {

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
