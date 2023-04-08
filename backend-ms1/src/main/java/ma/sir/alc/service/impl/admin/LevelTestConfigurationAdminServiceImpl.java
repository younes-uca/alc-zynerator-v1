package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.LevelTestConfiguration;
import ma.sir.alc.bean.history.LevelTestConfigurationHistory;
import ma.sir.alc.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.sir.alc.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.sir.alc.dao.facade.core.LevelTestConfigurationDao;
import ma.sir.alc.dao.facade.history.LevelTestConfigurationHistoryDao;
import ma.sir.alc.dao.specification.core.LevelTestConfigurationSpecification;
import ma.sir.alc.service.facade.admin.LevelTestConfigurationAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.ParcoursAdminService ;


import java.util.List;
@Service
public class LevelTestConfigurationAdminServiceImpl extends AbstractServiceImpl<LevelTestConfiguration,LevelTestConfigurationHistory, LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria, LevelTestConfigurationDao,
LevelTestConfigurationHistoryDao> implements LevelTestConfigurationAdminService {



    public List<LevelTestConfiguration> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }

    public void configure() {
        super.configure(LevelTestConfiguration.class,LevelTestConfigurationHistory.class, LevelTestConfigurationHistoryCriteria.class, LevelTestConfigurationSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    public LevelTestConfigurationAdminServiceImpl(LevelTestConfigurationDao dao, LevelTestConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}