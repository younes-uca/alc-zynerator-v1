package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TypeTeacher;
import ma.sir.alc.bean.history.TypeTeacherHistory;
import ma.sir.alc.dao.criteria.core.TypeTeacherCriteria;
import ma.sir.alc.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.sir.alc.dao.facade.core.TypeTeacherDao;
import ma.sir.alc.dao.facade.history.TypeTeacherHistoryDao;
import ma.sir.alc.dao.specification.core.TypeTeacherSpecification;
import ma.sir.alc.service.facade.admin.TypeTeacherAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeTeacherAdminServiceImpl extends AbstractServiceImpl<TypeTeacher,TypeTeacherHistory, TypeTeacherCriteria, TypeTeacherHistoryCriteria, TypeTeacherDao,
TypeTeacherHistoryDao> implements TypeTeacherAdminService {


    public TypeTeacher findByReferenceEntity(TypeTeacher t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeTeacher.class,TypeTeacherHistory.class, TypeTeacherHistoryCriteria.class, TypeTeacherSpecification.class);
    }

    public TypeTeacherAdminServiceImpl(TypeTeacherDao dao, TypeTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}