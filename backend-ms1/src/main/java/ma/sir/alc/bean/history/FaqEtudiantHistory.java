package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "faq_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="faq_etudiant_seq",sequenceName="faq_etudiant_seq",allocationSize=1, initialValue = 1)
public class FaqEtudiantHistory extends HistBusinessObject  {


    public FaqEtudiantHistory() {
    super();
    }

    public FaqEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="faq_etudiant_seq")
    public Long getId() {
    return id;
    }
}

