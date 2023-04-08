package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.RecommendTeacher;
import ma.sir.alc.bean.history.RecommendTeacherHistory;
import ma.sir.alc.dao.criteria.core.RecommendTeacherCriteria;
import ma.sir.alc.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.sir.alc.dao.facade.core.RecommendTeacherDao;
import ma.sir.alc.dao.facade.history.RecommendTeacherHistoryDao;
import ma.sir.alc.dao.specification.core.RecommendTeacherSpecification;
import ma.sir.alc.service.facade.admin.RecommendTeacherAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class RecommendTeacherAdminServiceImpl extends AbstractServiceImpl<RecommendTeacher,RecommendTeacherHistory, RecommendTeacherCriteria, RecommendTeacherHistoryCriteria, RecommendTeacherDao,
RecommendTeacherHistoryDao> implements RecommendTeacherAdminService {


    public RecommendTeacher findByReferenceEntity(RecommendTeacher t){
        return  dao.findByRef(t.getRef());
    }

    public List<RecommendTeacher> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }

    public void configure() {
        super.configure(RecommendTeacher.class,RecommendTeacherHistory.class, RecommendTeacherHistoryCriteria.class, RecommendTeacherSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public RecommendTeacherAdminServiceImpl(RecommendTeacherDao dao, RecommendTeacherHistoryDao historyDao) {
        super(dao, historyDao);
    }

}