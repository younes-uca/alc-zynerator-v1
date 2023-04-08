package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "howe_work_q_s_t_reponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="howe_work_q_s_t_reponse_seq",sequenceName="howe_work_q_s_t_reponse_seq",allocationSize=1, initialValue = 1)
public class HoweWorkQSTReponseHistory extends HistBusinessObject  {


    public HoweWorkQSTReponseHistory() {
    super();
    }

    public HoweWorkQSTReponseHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="howe_work_q_s_t_reponse_seq")
    public Long getId() {
    return id;
    }
}

