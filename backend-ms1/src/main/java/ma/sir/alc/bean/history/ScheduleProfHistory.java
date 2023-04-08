package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "schedule_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="schedule_prof_seq",sequenceName="schedule_prof_seq",allocationSize=1, initialValue = 1)
public class ScheduleProfHistory extends HistBusinessObject  {


    public ScheduleProfHistory() {
    super();
    }

    public ScheduleProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="schedule_prof_seq")
    public Long getId() {
    return id;
    }
}

