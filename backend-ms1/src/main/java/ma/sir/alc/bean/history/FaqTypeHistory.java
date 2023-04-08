package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "faq_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="faq_type_seq",sequenceName="faq_type_seq",allocationSize=1, initialValue = 1)
public class FaqTypeHistory extends HistBusinessObject  {


    public FaqTypeHistory() {
    super();
    }

    public FaqTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="faq_type_seq")
    public Long getId() {
    return id;
    }
}

