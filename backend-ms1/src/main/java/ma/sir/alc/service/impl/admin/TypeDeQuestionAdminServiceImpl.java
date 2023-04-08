package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.TypeDeQuestion;
import ma.sir.alc.bean.history.TypeDeQuestionHistory;
import ma.sir.alc.dao.criteria.core.TypeDeQuestionCriteria;
import ma.sir.alc.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.sir.alc.dao.facade.core.TypeDeQuestionDao;
import ma.sir.alc.dao.facade.history.TypeDeQuestionHistoryDao;
import ma.sir.alc.dao.specification.core.TypeDeQuestionSpecification;
import ma.sir.alc.service.facade.admin.TypeDeQuestionAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeDeQuestionAdminServiceImpl extends AbstractServiceImpl<TypeDeQuestion,TypeDeQuestionHistory, TypeDeQuestionCriteria, TypeDeQuestionHistoryCriteria, TypeDeQuestionDao,
TypeDeQuestionHistoryDao> implements TypeDeQuestionAdminService {


    public TypeDeQuestion findByReferenceEntity(TypeDeQuestion t){
        return  dao.findByRef(t.getRef());
    }


    public void configure() {
        super.configure(TypeDeQuestion.class,TypeDeQuestionHistory.class, TypeDeQuestionHistoryCriteria.class, TypeDeQuestionSpecification.class);
    }

    public TypeDeQuestionAdminServiceImpl(TypeDeQuestionDao dao, TypeDeQuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}