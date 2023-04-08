package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.CategorieProf;
import ma.sir.alc.bean.history.CategorieProfHistory;
import ma.sir.alc.dao.criteria.core.CategorieProfCriteria;
import ma.sir.alc.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.sir.alc.dao.facade.core.CategorieProfDao;
import ma.sir.alc.dao.facade.history.CategorieProfHistoryDao;
import ma.sir.alc.dao.specification.core.CategorieProfSpecification;
import ma.sir.alc.service.facade.admin.CategorieProfAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.service.facade.admin.ProfAdminService ;


import java.util.List;
@Service
public class CategorieProfAdminServiceImpl extends AbstractServiceImpl<CategorieProf,CategorieProfHistory, CategorieProfCriteria, CategorieProfHistoryCriteria, CategorieProfDao,
CategorieProfHistoryDao> implements CategorieProfAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public CategorieProf create(CategorieProf t) {
        super.create(t);
        if (t.getProfs() != null) {
                t.getProfs().forEach(element-> {
                    element.setCategorieProf(t);
                    profService.create(element);
            });
        }
        return t;
    }

    public CategorieProf findWithAssociatedLists(Long id){
        CategorieProf result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setProfs(profService.findByCategorieProfId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        profService.deleteByCategorieProfId(id);
    }


    public void updateWithAssociatedLists(CategorieProf categorieProf){
    if(categorieProf !=null && categorieProf.getId() != null){
            List<List<Prof>> resultProfs= profService.getToBeSavedAndToBeDeleted(profService.findByCategorieProfId(categorieProf.getId()),categorieProf.getProfs());
            profService.delete(resultProfs.get(1));
            ListUtil.emptyIfNull(resultProfs.get(0)).forEach(e -> e.setCategorieProf(categorieProf));
            profService.update(resultProfs.get(0),true);
    }
    }

    public CategorieProf findByReferenceEntity(CategorieProf t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(CategorieProf.class,CategorieProfHistory.class, CategorieProfHistoryCriteria.class, CategorieProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    public CategorieProfAdminServiceImpl(CategorieProfDao dao, CategorieProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}