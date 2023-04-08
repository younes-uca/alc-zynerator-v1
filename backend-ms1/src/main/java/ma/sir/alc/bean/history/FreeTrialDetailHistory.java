package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "free_trial_detail")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="free_trial_detail_seq",sequenceName="free_trial_detail_seq",allocationSize=1, initialValue = 1)
public class FreeTrialDetailHistory extends HistBusinessObject  {


    public FreeTrialDetailHistory() {
    super();
    }

    public FreeTrialDetailHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="free_trial_detail_seq")
    public Long getId() {
    return id;
    }
}

