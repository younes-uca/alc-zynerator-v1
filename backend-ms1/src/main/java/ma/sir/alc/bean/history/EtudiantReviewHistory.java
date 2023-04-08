package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "etudiant_review")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_review_seq",sequenceName="etudiant_review_seq",allocationSize=1, initialValue = 1)
public class EtudiantReviewHistory extends HistBusinessObject  {


    public EtudiantReviewHistory() {
    super();
    }

    public EtudiantReviewHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_review_seq")
    public Long getId() {
    return id;
    }
}

