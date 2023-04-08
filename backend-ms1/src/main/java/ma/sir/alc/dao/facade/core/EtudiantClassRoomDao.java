package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.EtudiantClassRoom;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface EtudiantClassRoomDao extends AbstractRepository<EtudiantClassRoom,Long>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
