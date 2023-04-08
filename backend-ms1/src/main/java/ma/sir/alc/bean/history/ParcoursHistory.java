package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "parcours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="parcours_seq",sequenceName="parcours_seq",allocationSize=1, initialValue = 1)
public class ParcoursHistory extends HistBusinessObject  {


    public ParcoursHistory() {
    super();
    }

    public ParcoursHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="parcours_seq")
    public Long getId() {
    return id;
    }
}

