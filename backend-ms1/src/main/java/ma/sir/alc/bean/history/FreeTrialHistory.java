package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "free_trial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="free_trial_seq",sequenceName="free_trial_seq",allocationSize=1, initialValue = 1)
public class FreeTrialHistory extends HistBusinessObject  {


    public FreeTrialHistory() {
    super();
    }

    public FreeTrialHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="free_trial_seq")
    public Long getId() {
    return id;
    }
}

