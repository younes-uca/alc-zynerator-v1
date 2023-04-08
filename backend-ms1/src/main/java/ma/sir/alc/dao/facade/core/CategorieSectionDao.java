package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.CategorieSection;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.CategorieSection;
import java.util.List;


@Repository
public interface CategorieSectionDao extends AbstractRepository<CategorieSection,Long>  {
    CategorieSection findByCode(String code);
    int deleteByCode(String code);

    List<CategorieSection> findBySuperCategorieSectionId(Long id);
    int deleteBySuperCategorieSectionId(Long id);

}
