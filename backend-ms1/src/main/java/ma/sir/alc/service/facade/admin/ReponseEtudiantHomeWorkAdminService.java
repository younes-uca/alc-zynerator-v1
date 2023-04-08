package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ReponseEtudiantHomeWorkAdminService extends  IService<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria>  {

    List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id);
    int deleteByHoweWorkQSTReponseId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id);
    int deleteByHomeWorkEtudiantId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
