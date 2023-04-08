package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="home_work_seq",sequenceName="home_work_seq",allocationSize=1, initialValue = 1)
public class HomeWorkHistory extends HistBusinessObject  {


    public HomeWorkHistory() {
    super();
    }

    public HomeWorkHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="home_work_seq")
    public Long getId() {
    return id;
    }
}

