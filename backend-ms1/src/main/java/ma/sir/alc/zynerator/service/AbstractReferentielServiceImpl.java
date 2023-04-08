package ma.sir.alc.zynerator.service;

import ma.sir.alc.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.alc.zynerator.criteria.BaseCriteria;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import ma.sir.alc.zynerator.history.HistCriteria;
import ma.sir.alc.zynerator.repository.AbstractHistoryRepository;
import ma.sir.alc.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}