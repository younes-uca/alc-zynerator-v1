package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "reponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_seq",sequenceName="reponse_seq",allocationSize=1, initialValue = 1)
public class ReponseHistory extends HistBusinessObject  {


    public ReponseHistory() {
    super();
    }

    public ReponseHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_seq")
    public Long getId() {
    return id;
    }
}

