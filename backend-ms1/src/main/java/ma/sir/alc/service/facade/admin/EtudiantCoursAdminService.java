package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.EtudiantCours;
import ma.sir.alc.dao.criteria.core.EtudiantCoursCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface EtudiantCoursAdminService extends  IService<EtudiantCours,EtudiantCoursCriteria, EtudiantCoursHistoryCriteria>  {

    List<EtudiantCours> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
