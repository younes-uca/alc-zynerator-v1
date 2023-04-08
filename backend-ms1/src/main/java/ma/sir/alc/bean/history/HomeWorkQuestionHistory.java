package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "home_work_question")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="home_work_question_seq",sequenceName="home_work_question_seq",allocationSize=1, initialValue = 1)
public class HomeWorkQuestionHistory extends HistBusinessObject  {


    public HomeWorkQuestionHistory() {
    super();
    }

    public HomeWorkQuestionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="home_work_question_seq")
    public Long getId() {
    return id;
    }
}

