package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "groupe_etude")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="groupe_etude_seq",sequenceName="groupe_etude_seq",allocationSize=1, initialValue = 1)
public class GroupeEtudeHistory extends HistBusinessObject  {


    public GroupeEtudeHistory() {
    super();
    }

    public GroupeEtudeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="groupe_etude_seq")
    public Long getId() {
    return id;
    }
}

