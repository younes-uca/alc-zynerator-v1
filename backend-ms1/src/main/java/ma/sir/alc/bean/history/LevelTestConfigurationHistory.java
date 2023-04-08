package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "level_test_configuration")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="level_test_configuration_seq",sequenceName="level_test_configuration_seq",allocationSize=1, initialValue = 1)
public class LevelTestConfigurationHistory extends HistBusinessObject  {


    public LevelTestConfigurationHistory() {
    super();
    }

    public LevelTestConfigurationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="level_test_configuration_seq")
    public Long getId() {
    return id;
    }
}

