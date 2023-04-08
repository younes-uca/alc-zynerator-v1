package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "level_test_configuration")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="level_test_configuration_seq",sequenceName="level_test_configuration_seq",allocationSize=1, initialValue = 1)
public class LevelTestConfiguration    extends AuditBusinessObject   {

    private Long id;

    private BigDecimal noteMin = BigDecimal.ZERO;
    private BigDecimal noteMax = BigDecimal.ZERO;

    private Parcours parcours ;
    


    public LevelTestConfiguration(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="level_test_configuration_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getNoteMin(){
        return this.noteMin;
    }
    public void setNoteMin(BigDecimal noteMin){
        this.noteMin = noteMin;
    }
    public BigDecimal getNoteMax(){
        return this.noteMax;
    }
    public void setNoteMax(BigDecimal noteMax){
        this.noteMax = noteMax;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LevelTestConfiguration levelTestConfiguration = (LevelTestConfiguration) o;
        return id != null && id.equals(levelTestConfiguration.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

