package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "groupe_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="groupe_etudiant_seq",sequenceName="groupe_etudiant_seq",allocationSize=1, initialValue = 1)
public class GroupeEtudiantHistory extends HistBusinessObject  {


    public GroupeEtudiantHistory() {
    super();
    }

    public GroupeEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="groupe_etudiant_seq")
    public Long getId() {
    return id;
    }
}

