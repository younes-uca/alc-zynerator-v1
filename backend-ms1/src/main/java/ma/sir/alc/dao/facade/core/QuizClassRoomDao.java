package ma.sir.alc.dao.facade.core;


import ma.sir.alc.zynerator.repository.AbstractRepository;
import ma.sir.alc.bean.core.QuizClassRoom;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface QuizClassRoomDao extends AbstractRepository<QuizClassRoom,Long>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);

}
