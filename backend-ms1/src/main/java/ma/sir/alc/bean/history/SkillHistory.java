package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "skill")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="skill_seq",sequenceName="skill_seq",allocationSize=1, initialValue = 1)
public class SkillHistory extends HistBusinessObject  {


    public SkillHistory() {
    super();
    }

    public SkillHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="skill_seq")
    public Long getId() {
    return id;
    }
}

