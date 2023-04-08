package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "statut_social")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="statut_social_seq",sequenceName="statut_social_seq",allocationSize=1, initialValue = 1)
public class StatutSocialHistory extends HistBusinessObject  {


    public StatutSocialHistory() {
    super();
    }

    public StatutSocialHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="statut_social_seq")
    public Long getId() {
    return id;
    }
}

