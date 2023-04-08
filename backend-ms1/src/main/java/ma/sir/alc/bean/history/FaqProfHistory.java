package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "faq_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="faq_prof_seq",sequenceName="faq_prof_seq",allocationSize=1, initialValue = 1)
public class FaqProfHistory extends HistBusinessObject  {


    public FaqProfHistory() {
    super();
    }

    public FaqProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="faq_prof_seq")
    public Long getId() {
    return id;
    }
}

