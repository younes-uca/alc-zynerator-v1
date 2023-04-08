package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "inscription")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="inscription_seq",sequenceName="inscription_seq",allocationSize=1, initialValue = 1)
public class InscriptionHistory extends HistBusinessObject  {


    public InscriptionHistory() {
    super();
    }

    public InscriptionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="inscription_seq")
    public Long getId() {
    return id;
    }
}

