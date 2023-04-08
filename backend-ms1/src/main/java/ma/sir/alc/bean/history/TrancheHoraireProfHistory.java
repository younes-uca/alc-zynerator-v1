package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "tranche_horaire_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tranche_horaire_prof_seq",sequenceName="tranche_horaire_prof_seq",allocationSize=1, initialValue = 1)
public class TrancheHoraireProfHistory extends HistBusinessObject  {


    public TrancheHoraireProfHistory() {
    super();
    }

    public TrancheHoraireProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tranche_horaire_prof_seq")
    public Long getId() {
    return id;
    }
}

