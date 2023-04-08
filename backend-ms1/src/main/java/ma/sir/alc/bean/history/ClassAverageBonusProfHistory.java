package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "class_average_bonus_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="class_average_bonus_prof_seq",sequenceName="class_average_bonus_prof_seq",allocationSize=1, initialValue = 1)
public class ClassAverageBonusProfHistory extends HistBusinessObject  {


    public ClassAverageBonusProfHistory() {
    super();
    }

    public ClassAverageBonusProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="class_average_bonus_prof_seq")
    public Long getId() {
    return id;
    }
}

