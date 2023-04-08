package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "cours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="cours_seq",sequenceName="cours_seq",allocationSize=1, initialValue = 1)
public class CoursHistory extends HistBusinessObject  {


    public CoursHistory() {
    super();
    }

    public CoursHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="cours_seq")
    public Long getId() {
    return id;
    }
}

