package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etat_cours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_cours_seq",sequenceName="etat_cours_seq",allocationSize=1, initialValue = 1)
public class EtatCoursHistory extends HistBusinessObject  {


    public EtatCoursHistory() {
    super();
    }

    public EtatCoursHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_cours_seq")
    public Long getId() {
    return id;
    }
}

