package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "pack_student")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="pack_student_seq",sequenceName="pack_student_seq",allocationSize=1, initialValue = 1)
public class PackStudentHistory extends HistBusinessObject  {


    public PackStudentHistory() {
    super();
    }

    public PackStudentHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pack_student_seq")
    public Long getId() {
    return id;
    }
}

