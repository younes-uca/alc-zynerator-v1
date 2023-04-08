package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.Skill;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.Skill;
import java.util.List;


@Repository
public interface SkillDao extends AbstractRepository<Skill,Long>  {
    Skill findByCode(String code);
    int deleteByCode(String code);


}
