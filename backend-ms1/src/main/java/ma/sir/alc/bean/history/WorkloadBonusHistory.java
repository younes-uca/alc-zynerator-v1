package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "workload_bonus")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="workload_bonus_seq",sequenceName="workload_bonus_seq",allocationSize=1, initialValue = 1)
public class WorkloadBonusHistory extends HistBusinessObject  {


    public WorkloadBonusHistory() {
    super();
    }

    public WorkloadBonusHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workload_bonus_seq")
    public Long getId() {
    return id;
    }
}

