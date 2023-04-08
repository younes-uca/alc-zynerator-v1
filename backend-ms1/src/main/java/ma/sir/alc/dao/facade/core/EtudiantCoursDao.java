package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtudiantCours;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EtudiantCoursDao extends AbstractRepository<EtudiantCours,Long>  {

    List<EtudiantCours> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);

}
