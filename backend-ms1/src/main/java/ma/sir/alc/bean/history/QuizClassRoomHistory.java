package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "quiz_class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_class_room_seq",sequenceName="quiz_class_room_seq",allocationSize=1, initialValue = 1)
public class QuizClassRoomHistory extends HistBusinessObject  {


    public QuizClassRoomHistory() {
    super();
    }

    public QuizClassRoomHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_class_room_seq")
    public Long getId() {
    return id;
    }
}

