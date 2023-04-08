package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "services")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="services_seq",sequenceName="services_seq",allocationSize=1, initialValue = 1)
public class ServicesHistory extends HistBusinessObject  {


    public ServicesHistory() {
    super();
    }

    public ServicesHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="services_seq")
    public Long getId() {
    return id;
    }
}

