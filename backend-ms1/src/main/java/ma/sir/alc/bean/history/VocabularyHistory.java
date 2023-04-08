package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "vocabulary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="vocabulary_seq",sequenceName="vocabulary_seq",allocationSize=1, initialValue = 1)
public class VocabularyHistory extends HistBusinessObject  {


    public VocabularyHistory() {
    super();
    }

    public VocabularyHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vocabulary_seq")
    public Long getId() {
    return id;
    }
}

