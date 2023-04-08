package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Section;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Section;
import java.util.List;


@Repository
public interface SectionDao extends AbstractRepository<Section,Long>  {
    Section findByCode(String code);
    int deleteByCode(String code);

    List<Section> findByCategorieSectionId(Long id);
    int deleteByCategorieSectionId(Long id);
    List<Section> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<Section> findBySessionCoursId(Long id);
    int deleteBySessionCoursId(Long id);

}
