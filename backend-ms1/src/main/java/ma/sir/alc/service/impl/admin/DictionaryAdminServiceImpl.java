package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.Dictionary;
import ma.sir.alc.bean.history.DictionaryHistory;
import ma.sir.alc.dao.criteria.core.DictionaryCriteria;
import ma.sir.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.alc.dao.facade.core.DictionaryDao;
import ma.sir.alc.dao.facade.history.DictionaryHistoryDao;
import ma.sir.alc.dao.specification.core.DictionarySpecification;
import ma.sir.alc.service.facade.admin.DictionaryAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.EtudiantAdminService ;


import java.util.List;
@Service
public class DictionaryAdminServiceImpl extends AbstractServiceImpl<Dictionary,DictionaryHistory, DictionaryCriteria, DictionaryHistoryCriteria, DictionaryDao,
DictionaryHistoryDao> implements DictionaryAdminService {



    public List<Dictionary> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }

    public void configure() {
        super.configure(Dictionary.class,DictionaryHistory.class, DictionaryHistoryCriteria.class, DictionarySpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    public DictionaryAdminServiceImpl(DictionaryDao dao, DictionaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}