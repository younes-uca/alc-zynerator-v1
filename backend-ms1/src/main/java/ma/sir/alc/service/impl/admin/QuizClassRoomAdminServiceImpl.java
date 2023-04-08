package ma.sir.alc.service.impl.admin;

import ma.sir.alc.bean.core.QuizClassRoom;
import ma.sir.alc.bean.history.QuizClassRoomHistory;
import ma.sir.alc.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.alc.dao.facade.core.QuizClassRoomDao;
import ma.sir.alc.dao.facade.history.QuizClassRoomHistoryDao;
import ma.sir.alc.dao.specification.core.QuizClassRoomSpecification;
import ma.sir.alc.service.facade.admin.QuizClassRoomAdminService;
import ma.sir.alc.zynerator.service.AbstractServiceImpl;
import ma.sir.alc.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.alc.service.facade.admin.ClassRoomAdminService ;
import ma.sir.alc.service.facade.admin.QuizAdminService ;


import java.util.List;
@Service
public class QuizClassRoomAdminServiceImpl extends AbstractServiceImpl<QuizClassRoom,QuizClassRoomHistory, QuizClassRoomCriteria, QuizClassRoomHistoryCriteria, QuizClassRoomDao,
QuizClassRoomHistoryDao> implements QuizClassRoomAdminService {



    public List<QuizClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<QuizClassRoom> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }

    public void configure() {
        super.configure(QuizClassRoom.class,QuizClassRoomHistory.class, QuizClassRoomHistoryCriteria.class, QuizClassRoomSpecification.class);
    }

    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private QuizAdminService quizService ;
    public QuizClassRoomAdminServiceImpl(QuizClassRoomDao dao, QuizClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}