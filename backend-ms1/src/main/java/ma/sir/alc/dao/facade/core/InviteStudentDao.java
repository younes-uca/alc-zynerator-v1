package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.InviteStudent;
import org.springframework.stereotype.Repository;
import ma.sir.alc.bean.core.InviteStudent;
import java.util.List;


@Repository
public interface InviteStudentDao extends AbstractRepository<InviteStudent,Long>  {
    InviteStudent findByCode(String code);
    int deleteByCode(String code);

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
