package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.CategorieProf;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.CategorieProf;
import java.util.List;


@Repository
public interface CategorieProfDao extends AbstractRepository<CategorieProf,Long>  {
    CategorieProf findByCode(String code);
    int deleteByCode(String code);


}
