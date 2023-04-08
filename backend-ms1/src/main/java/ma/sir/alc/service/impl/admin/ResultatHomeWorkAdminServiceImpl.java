package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.ResultatHomeWork;
import ma.sir.alc.bean.history.ResultatHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.sir.alc.dao.facade.core.ResultatHomeWorkDao;
import ma.sir.alc.dao.facade.history.ResultatHomeWorkHistoryDao;
import ma.sir.alc.dao.specification.core.ResultatHomeWorkSpecification;
import ma.sir.alc.service.facade.admin.ResultatHomeWorkAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class ResultatHomeWorkAdminServiceImpl extends AbstractServiceImpl<ResultatHomeWork,ResultatHomeWorkHistory, ResultatHomeWorkCriteria, ResultatHomeWorkHistoryCriteria, ResultatHomeWorkDao,
ResultatHomeWorkHistoryDao> implements ResultatHomeWorkAdminService {


    public ResultatHomeWork findByReferenceEntity(ResultatHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(ResultatHomeWork.class,ResultatHomeWorkHistory.class, ResultatHomeWorkHistoryCriteria.class, ResultatHomeWorkSpecification.class);
    }

    public ResultatHomeWorkAdminServiceImpl(ResultatHomeWorkDao dao, ResultatHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}