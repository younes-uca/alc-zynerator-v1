package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.TypeTeacher;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.TypeTeacher;
import java.util.List;


@Repository
public interface TypeTeacherDao extends AbstractRepository<TypeTeacher,Long>  {
    TypeTeacher findByCode(String code);
    int deleteByCode(String code);


}
