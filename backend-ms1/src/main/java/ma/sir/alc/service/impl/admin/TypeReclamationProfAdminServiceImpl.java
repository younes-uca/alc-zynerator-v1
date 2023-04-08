package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TypeReclamationProf;
import ma.sir.alc.bean.history.TypeReclamationProfHistory;
import ma.sir.alc.dao.criteria.core.TypeReclamationProfCriteria;
import ma.sir.alc.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.TypeReclamationProfDao;
import ma.sir.alc.dao.facade.history.TypeReclamationProfHistoryDao;
import ma.sir.alc.dao.specification.core.TypeReclamationProfSpecification;
import ma.sir.alc.service.facade.admin.TypeReclamationProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationProfAdminServiceImpl extends AbstractServiceImpl<TypeReclamationProf,TypeReclamationProfHistory, TypeReclamationProfCriteria, TypeReclamationProfHistoryCriteria, TypeReclamationProfDao,
TypeReclamationProfHistoryDao> implements TypeReclamationProfAdminService {


    public TypeReclamationProf findByReferenceEntity(TypeReclamationProf t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationProf.class,TypeReclamationProfHistory.class, TypeReclamationProfHistoryCriteria.class, TypeReclamationProfSpecification.class);
    }

    public TypeReclamationProfAdminServiceImpl(TypeReclamationProfDao dao, TypeReclamationProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}