package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.Dictionary;
import ma.sir.alc.dao.criteria.core.DictionaryCriteria;
import ma.sir.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface DictionaryAdminService extends  IService<Dictionary,DictionaryCriteria, DictionaryHistoryCriteria>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
