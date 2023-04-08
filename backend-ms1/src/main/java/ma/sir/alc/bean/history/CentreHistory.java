package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "centre")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="centre_seq",sequenceName="centre_seq",allocationSize=1, initialValue = 1)
public class CentreHistory extends HistBusinessObject  {


    public CentreHistory() {
    super();
    }

    public CentreHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="centre_seq")
    public Long getId() {
    return id;
    }
}

