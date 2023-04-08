package ma.sir.alc.service.facade.admin;

import java.util.List;
import ma.sir.alc.bean.core.QuizClassRoom;
import ma.sir.alc.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.alc.zynerator.service.IService;

public interface QuizClassRoomAdminService extends  IService<QuizClassRoom,QuizClassRoomCriteria, QuizClassRoomHistoryCriteria>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
