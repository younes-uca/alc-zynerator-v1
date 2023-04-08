package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "fonction")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="fonction_seq",sequenceName="fonction_seq",allocationSize=1, initialValue = 1)
public class FonctionHistory extends HistBusinessObject  {


    public FonctionHistory() {
    super();
    }

    public FonctionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="fonction_seq")
    public Long getId() {
    return id;
    }
}

