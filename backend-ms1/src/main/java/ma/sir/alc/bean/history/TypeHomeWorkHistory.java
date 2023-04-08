package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_home_work_seq",sequenceName="type_home_work_seq",allocationSize=1, initialValue = 1)
public class TypeHomeWorkHistory extends HistBusinessObject  {


    public TypeHomeWorkHistory() {
    super();
    }

    public TypeHomeWorkHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_home_work_seq")
    public Long getId() {
    return id;
    }
}

