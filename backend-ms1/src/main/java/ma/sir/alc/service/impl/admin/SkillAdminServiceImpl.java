package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Skill;
import ma.sir.alc.bean.history.SkillHistory;
import ma.sir.alc.dao.criteria.core.SkillCriteria;
import ma.sir.alc.dao.criteria.history.SkillHistoryCriteria;
import ma.sir.alc.dao.facade.core.SkillDao;
import ma.sir.alc.dao.facade.history.SkillHistoryDao;
import ma.sir.alc.dao.specification.core.SkillSpecification;
import ma.sir.alc.service.facade.admin.SkillAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SkillAdminServiceImpl extends AbstractServiceImpl<Skill,SkillHistory, SkillCriteria, SkillHistoryCriteria, SkillDao,
SkillHistoryDao> implements SkillAdminService {


    public Skill findByReferenceEntity(Skill t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Skill.class,SkillHistory.class, SkillHistoryCriteria.class, SkillSpecification.class);
    }

    public SkillAdminServiceImpl(SkillDao dao, SkillHistoryDao historyDao) {
        super(dao, historyDao);
    }

}