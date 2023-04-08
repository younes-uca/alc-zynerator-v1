package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "vocabulary_quiz")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="vocabulary_quiz_seq",sequenceName="vocabulary_quiz_seq",allocationSize=1, initialValue = 1)
public class VocabularyQuizHistory extends HistBusinessObject  {


    public VocabularyQuizHistory() {
    super();
    }

    public VocabularyQuizHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vocabulary_quiz_seq")
    public Long getId() {
    return id;
    }
}

