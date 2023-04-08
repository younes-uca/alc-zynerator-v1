package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.LevelTestConfiguration;
import ma.sir.alc.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.sir.alc.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface LevelTestConfigurationAdminService extends  IService<LevelTestConfiguration,LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
