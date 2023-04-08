package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "recommend_teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="recommend_teacher_seq",sequenceName="recommend_teacher_seq",allocationSize=1, initialValue = 1)
public class RecommendTeacherHistory extends HistBusinessObject  {


    public RecommendTeacherHistory() {
    super();
    }

    public RecommendTeacherHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="recommend_teacher_seq")
    public Long getId() {
    return id;
    }
}

