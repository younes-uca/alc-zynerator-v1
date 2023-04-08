package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "invite_student")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="invite_student_seq",sequenceName="invite_student_seq",allocationSize=1, initialValue = 1)
public class InviteStudentHistory extends HistBusinessObject  {


    public InviteStudentHistory() {
    super();
    }

    public InviteStudentHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="invite_student_seq")
    public Long getId() {
    return id;
    }
}

