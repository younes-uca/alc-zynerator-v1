package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "section_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="section_item_seq",sequenceName="section_item_seq",allocationSize=1, initialValue = 1)
public class SectionItemHistory extends HistBusinessObject  {


    public SectionItemHistory() {
    super();
    }

    public SectionItemHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="section_item_seq")
    public Long getId() {
    return id;
    }
}

