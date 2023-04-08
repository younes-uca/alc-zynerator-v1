package  ma.sir.alc.dao.specification.core;

import ma.sir.alc.zynerator.specification.AbstractSpecification;
import ma.sir.alc.dao.criteria.core.ScheduleProfCriteria;
import ma.sir.alc.bean.core.ScheduleProf;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ScheduleProfSpecification extends  AbstractSpecification<ScheduleProfCriteria, ScheduleProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("subject", criteria.getSubject(),criteria.getSubjectLike());
        addPredicate("startTime", criteria.getStartTime(), criteria.getStartTimeFrom(), criteria.getStartTimeTo());
        addPredicate("endTime", criteria.getEndTime(), criteria.getEndTimeFrom(), criteria.getEndTimeTo());
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("grpName", criteria.getGrpName(),criteria.getGrpNameLike());
        addPredicate("profName", criteria.getProfName(),criteria.getProfNameLike());
        addPredicateLong("profsId", criteria.getProfsId(), criteria.getProfsIdMin(), criteria.getProfsIdMax());
        addPredicateFk("groupeEtudiant","id", criteria.getGroupeEtudiant()==null?null:criteria.getGroupeEtudiant().getId());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("cours","id", criteria.getCours()==null?null:criteria.getCours().getId());
        addPredicateFk("cours","code", criteria.getCours()==null?null:criteria.getCours().getCode());
    }

    public ScheduleProfSpecification(ScheduleProfCriteria criteria) {
        super(criteria);
    }

    public ScheduleProfSpecification(ScheduleProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
