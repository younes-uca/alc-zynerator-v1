package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reclamation_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reclamation_prof_seq",sequenceName="reclamation_prof_seq",allocationSize=1, initialValue = 1)
public class ReclamationProfHistory extends HistBusinessObject  {


    public ReclamationProfHistory() {
    super();
    }

    public ReclamationProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_prof_seq")
    public Long getId() {
    return id;
    }
}

