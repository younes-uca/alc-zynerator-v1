package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="section_seq",sequenceName="section_seq",allocationSize=1, initialValue = 1)
public class SectionHistory extends HistBusinessObject  {


    public SectionHistory() {
    super();
    }

    public SectionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="section_seq")
    public Long getId() {
    return id;
    }
}

