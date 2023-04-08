package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reponse_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_etudiant_seq",sequenceName="reponse_etudiant_seq",allocationSize=1, initialValue = 1)
public class ReponseEtudiantHistory extends HistBusinessObject  {


    public ReponseEtudiantHistory() {
    super();
    }

    public ReponseEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_etudiant_seq")
    public Long getId() {
    return id;
    }
}

