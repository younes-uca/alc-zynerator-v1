package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.ClassRoom;
import ma.sir.alc.dao.criteria.core.ClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface ClassRoomAdminService extends  IService<ClassRoom,ClassRoomCriteria, ClassRoomHistoryCriteria>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);



}
