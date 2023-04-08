package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_etudiant_seq",sequenceName="etat_etudiant_seq",allocationSize=1, initialValue = 1)
public class EtatEtudiantHistory extends HistBusinessObject  {


    public EtatEtudiantHistory() {
    super();
    }

    public EtatEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_etudiant_seq")
    public Long getId() {
    return id;
    }
}

