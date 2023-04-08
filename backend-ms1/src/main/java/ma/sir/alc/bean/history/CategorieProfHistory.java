package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "categorie_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_prof_seq",sequenceName="categorie_prof_seq",allocationSize=1, initialValue = 1)
public class CategorieProfHistory extends HistBusinessObject  {


    public CategorieProfHistory() {
    super();
    }

    public CategorieProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_prof_seq")
    public Long getId() {
    return id;
    }
}

