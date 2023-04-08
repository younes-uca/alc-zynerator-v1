package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "calendrier_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="calendrier_prof_seq",sequenceName="calendrier_prof_seq",allocationSize=1, initialValue = 1)
public class CalendrierProfHistory extends HistBusinessObject  {


    public CalendrierProfHistory() {
    super();
    }

    public CalendrierProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="calendrier_prof_seq")
    public Long getId() {
    return id;
    }
}

