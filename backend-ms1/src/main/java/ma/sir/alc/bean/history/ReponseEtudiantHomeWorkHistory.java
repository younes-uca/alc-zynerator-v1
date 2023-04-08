package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reponse_etudiant_home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_etudiant_home_work_seq",sequenceName="reponse_etudiant_home_work_seq",allocationSize=1, initialValue = 1)
public class ReponseEtudiantHomeWorkHistory extends HistBusinessObject  {


    public ReponseEtudiantHomeWorkHistory() {
    super();
    }

    public ReponseEtudiantHomeWorkHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_etudiant_home_work_seq")
    public Long getId() {
    return id;
    }
}

