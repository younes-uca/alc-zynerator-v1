package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "price")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="price_seq",sequenceName="price_seq",allocationSize=1, initialValue = 1)
public class PriceHistory extends HistBusinessObject  {


    public PriceHistory() {
    super();
    }

    public PriceHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="price_seq")
    public Long getId() {
    return id;
    }
}

