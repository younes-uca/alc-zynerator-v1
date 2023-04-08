package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TypeReclamationEtudiant;
import ma.sir.alc.bean.history.TypeReclamationEtudiantHistory;
import ma.sir.alc.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.sir.alc.dao.facade.core.TypeReclamationEtudiantDao;
import ma.sir.alc.dao.facade.history.TypeReclamationEtudiantHistoryDao;
import ma.sir.alc.dao.specification.core.TypeReclamationEtudiantSpecification;
import ma.sir.alc.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<TypeReclamationEtudiant,TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantDao,
TypeReclamationEtudiantHistoryDao> implements TypeReclamationEtudiantAdminService {


    public TypeReclamationEtudiant findByReferenceEntity(TypeReclamationEtudiant t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeReclamationEtudiant.class,TypeReclamationEtudiantHistory.class, TypeReclamationEtudiantHistoryCriteria.class, TypeReclamationEtudiantSpecification.class);
    }

    public TypeReclamationEtudiantAdminServiceImpl(TypeReclamationEtudiantDao dao, TypeReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}