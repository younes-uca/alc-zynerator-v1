package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "teacher_locality")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="teacher_locality_seq",sequenceName="teacher_locality_seq",allocationSize=1, initialValue = 1)
public class TeacherLocalityHistory extends HistBusinessObject  {


    public TeacherLocalityHistory() {
    super();
    }

    public TeacherLocalityHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="teacher_locality_seq")
    public Long getId() {
    return id;
    }
}

