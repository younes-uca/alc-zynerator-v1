package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "prof_review")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prof_review_seq",sequenceName="prof_review_seq",allocationSize=1, initialValue = 1)
public class ProfReviewHistory extends HistBusinessObject  {


    public ProfReviewHistory() {
    super();
    }

    public ProfReviewHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prof_review_seq")
    public Long getId() {
    return id;
    }
}

