package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TypeHomeWork;
import ma.sir.alc.bean.history.TypeHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.TypeHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.sir.alc.dao.facade.core.TypeHomeWorkDao;
import ma.sir.alc.dao.facade.history.TypeHomeWorkHistoryDao;
import ma.sir.alc.dao.specification.core.TypeHomeWorkSpecification;
import ma.sir.alc.service.facade.admin.TypeHomeWorkAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeHomeWorkAdminServiceImpl extends AbstractServiceImpl<TypeHomeWork,TypeHomeWorkHistory, TypeHomeWorkCriteria, TypeHomeWorkHistoryCriteria, TypeHomeWorkDao,
TypeHomeWorkHistoryDao> implements TypeHomeWorkAdminService {


    public TypeHomeWork findByReferenceEntity(TypeHomeWork t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeHomeWork.class,TypeHomeWorkHistory.class, TypeHomeWorkHistoryCriteria.class, TypeHomeWorkSpecification.class);
    }

    public TypeHomeWorkAdminServiceImpl(TypeHomeWorkDao dao, TypeHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}