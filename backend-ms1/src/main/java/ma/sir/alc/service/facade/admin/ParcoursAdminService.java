package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Parcours;
import ma.sir.alc.dao.criteria.core.ParcoursCriteria;
import ma.sir.alc.dao.criteria.history.ParcoursHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ParcoursAdminService extends  IService<Parcours,ParcoursCriteria, ParcoursHistoryCriteria>  {

    List<Parcours> findByCentreId(Long id);
    int deleteByCentreId(Long id);



}
