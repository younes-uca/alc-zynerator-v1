package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.RecommendTeacher;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.RecommendTeacher;
import java.util.List;


@Repository
public interface RecommendTeacherDao extends AbstractRepository<RecommendTeacher,Long>  {
    RecommendTeacher findByRef(String ref);
    int deleteByRef(String ref);

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);

}
