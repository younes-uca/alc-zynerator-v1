package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "niveau_etude")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="niveau_etude_seq",sequenceName="niveau_etude_seq",allocationSize=1, initialValue = 1)
public class NiveauEtudeHistory extends HistBusinessObject  {


    public NiveauEtudeHistory() {
    super();
    }

    public NiveauEtudeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="niveau_etude_seq")
    public Long getId() {
    return id;
    }
}

