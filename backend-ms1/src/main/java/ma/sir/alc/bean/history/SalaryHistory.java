package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "salary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="salary_seq",sequenceName="salary_seq",allocationSize=1, initialValue = 1)
public class SalaryHistory extends HistBusinessObject  {


    public SalaryHistory() {
    super();
    }

    public SalaryHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="salary_seq")
    public Long getId() {
    return id;
    }
}

