package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="class_room_seq",sequenceName="class_room_seq",allocationSize=1, initialValue = 1)
public class ClassRoomHistory extends HistBusinessObject  {


    public ClassRoomHistory() {
    super();
    }

    public ClassRoomHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="class_room_seq")
    public Long getId() {
    return id;
    }
}

