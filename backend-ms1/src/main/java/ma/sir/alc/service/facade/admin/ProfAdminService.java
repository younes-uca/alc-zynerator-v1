package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.dao.criteria.core.ProfCriteria;
import ma.sir.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ProfAdminService extends  IService<Prof,ProfCriteria, ProfHistoryCriteria>  {
    Prof findByUsername(String username);

    List<Prof> findByLevelMinId(Long id);
    int deleteByLevelMinId(Long id);
    List<Prof> findByLevelMaxId(Long id);
    int deleteByLevelMaxId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);



}
