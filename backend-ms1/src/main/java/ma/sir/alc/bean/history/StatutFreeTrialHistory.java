package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "statut_free_trial")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="statut_free_trial_seq",sequenceName="statut_free_trial_seq",allocationSize=1, initialValue = 1)
public class StatutFreeTrialHistory extends HistBusinessObject  {


    public StatutFreeTrialHistory() {
    super();
    }

    public StatutFreeTrialHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="statut_free_trial_seq")
    public Long getId() {
    return id;
    }
}

