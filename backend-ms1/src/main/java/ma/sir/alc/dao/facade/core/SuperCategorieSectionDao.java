package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.SuperCategorieSection;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.SuperCategorieSection;
import java.util.List;


@Repository
public interface SuperCategorieSectionDao extends AbstractRepository<SuperCategorieSection,Long>  {
    SuperCategorieSection findByCode(String code);
    int deleteByCode(String code);


}
