package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "resultat_home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="resultat_home_work_seq",sequenceName="resultat_home_work_seq",allocationSize=1, initialValue = 1)
public class ResultatHomeWorkHistory extends HistBusinessObject  {


    public ResultatHomeWorkHistory() {
    super();
    }

    public ResultatHomeWorkHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="resultat_home_work_seq")
    public Long getId() {
    return id;
    }
}

