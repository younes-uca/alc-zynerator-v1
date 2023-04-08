package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "contact")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="contact_seq",sequenceName="contact_seq",allocationSize=1, initialValue = 1)
public class ContactHistory extends HistBusinessObject  {


    public ContactHistory() {
    super();
    }

    public ContactHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="contact_seq")
    public Long getId() {
    return id;
    }
}

