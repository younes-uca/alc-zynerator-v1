package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "interet_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="interet_etudiant_seq",sequenceName="interet_etudiant_seq",allocationSize=1, initialValue = 1)
public class InteretEtudiantHistory extends HistBusinessObject  {


    public InteretEtudiantHistory() {
    super();
    }

    public InteretEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="interet_etudiant_seq")
    public Long getId() {
    return id;
    }
}

