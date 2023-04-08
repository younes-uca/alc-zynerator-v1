package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "home_work_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="home_work_etudiant_seq",sequenceName="home_work_etudiant_seq",allocationSize=1, initialValue = 1)
public class HomeWorkEtudiantHistory extends HistBusinessObject  {


    public HomeWorkEtudiantHistory() {
    super();
    }

    public HomeWorkEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="home_work_etudiant_seq")
    public Long getId() {
    return id;
    }
}

