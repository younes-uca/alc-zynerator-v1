package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "tranche_horaire_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tranche_horaire_prof_seq",sequenceName="tranche_horaire_prof_seq",allocationSize=1, initialValue = 1)
public class TrancheHoraireProf    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String startHour;
    @Column(length = 500)
    private String endHour;
    private Integer day = 0;
    private Integer groupIndex = 0;
    private Long profsId ;

    private Prof prof ;
    


    public TrancheHoraireProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tranche_horaire_prof_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    public String getStartHour(){
        return this.startHour;
    }
    public void setStartHour(String startHour){
        this.startHour = startHour;
    }
    public String getEndHour(){
        return this.endHour;
    }
    public void setEndHour(String endHour){
        this.endHour = endHour;
    }
    public Integer getDay(){
        return this.day;
    }
    public void setDay(Integer day){
        this.day = day;
    }
    public Integer getGroupIndex(){
        return this.groupIndex;
    }
    public void setGroupIndex(Integer groupIndex){
        this.groupIndex = groupIndex;
    }
    public Long getProfsId(){
        return this.profsId;
    }
    public void setProfsId(Long profsId){
        this.profsId = profsId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrancheHoraireProf trancheHoraireProf = (TrancheHoraireProf) o;
        return id != null && id.equals(trancheHoraireProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

