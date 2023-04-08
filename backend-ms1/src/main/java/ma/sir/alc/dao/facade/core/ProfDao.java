package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Prof;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Prof;
import java.util.List;


@Repository
public interface ProfDao extends AbstractRepository<Prof,Long>  {
    Prof findByRef(String ref);
    int deleteByRef(String ref);

    List<Prof> findByLevelMinId(Long id);
    int deleteByLevelMinId(Long id);
    List<Prof> findByLevelMaxId(Long id);
    int deleteByLevelMaxId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);
    Prof findByUsername(String username);

}
