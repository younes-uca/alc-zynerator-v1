package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.EtudiantClassRoom;
import ma.sir.alc.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface EtudiantClassRoomAdminService extends  IService<EtudiantClassRoom,EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
