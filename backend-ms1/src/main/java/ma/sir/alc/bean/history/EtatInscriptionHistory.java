package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_inscription")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_inscription_seq",sequenceName="etat_inscription_seq",allocationSize=1, initialValue = 1)
public class EtatInscriptionHistory extends HistBusinessObject  {


    public EtatInscriptionHistory() {
    super();
    }

    public EtatInscriptionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_inscription_seq")
    public Long getId() {
    return id;
    }
}

