package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TrancheHoraireProf;
import ma.sir.alc.bean.history.TrancheHoraireProfHistory;
import ma.sir.alc.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.TrancheHoraireProfDao;
import ma.sir.alc.dao.facade.history.TrancheHoraireProfHistoryDao;
import ma.sir.alc.dao.specification.core.TrancheHoraireProfSpecification;
import ma.sir.alc.service.facade.admin.TrancheHoraireProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class TrancheHoraireProfAdminServiceImpl extends AbstractServiceImpl<TrancheHoraireProf,TrancheHoraireProfHistory, TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria, TrancheHoraireProfDao,
TrancheHoraireProfHistoryDao> implements TrancheHoraireProfAdminService {



    public List<TrancheHoraireProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(TrancheHoraireProf.class,TrancheHoraireProfHistory.class, TrancheHoraireProfHistoryCriteria.class, TrancheHoraireProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public TrancheHoraireProfAdminServiceImpl(TrancheHoraireProfDao dao, TrancheHoraireProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}