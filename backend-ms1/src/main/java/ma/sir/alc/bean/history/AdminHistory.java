package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "admin")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="admin_seq",sequenceName="admin_seq",allocationSize=1, initialValue = 1)
public class AdminHistory extends HistBusinessObject  {


    public AdminHistory() {
    super();
    }

    public AdminHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="admin_seq")
    public Long getId() {
    return id;
    }
}

