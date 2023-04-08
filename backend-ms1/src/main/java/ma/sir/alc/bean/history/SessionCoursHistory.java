package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "session_cours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="session_cours_seq",sequenceName="session_cours_seq",allocationSize=1, initialValue = 1)
public class SessionCoursHistory extends HistBusinessObject  {


    public SessionCoursHistory() {
    super();
    }

    public SessionCoursHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="session_cours_seq")
    public Long getId() {
    return id;
    }
}

