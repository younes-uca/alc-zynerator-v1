package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_reclamation_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_reclamation_etudiant_seq",sequenceName="type_reclamation_etudiant_seq",allocationSize=1, initialValue = 1)
public class TypeReclamationEtudiantHistory extends HistBusinessObject  {


    public TypeReclamationEtudiantHistory() {
    super();
    }

    public TypeReclamationEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_reclamation_etudiant_seq")
    public Long getId() {
    return id;
    }
}

