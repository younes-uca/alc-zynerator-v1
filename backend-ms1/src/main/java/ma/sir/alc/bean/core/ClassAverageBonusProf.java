package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "class_average_bonus_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="class_average_bonus_prof_seq",sequenceName="class_average_bonus_prof_seq",allocationSize=1, initialValue = 1)
public class ClassAverageBonusProf    extends AuditBusinessObject   {

    private Long id;

    private Integer mois = 0;
    private Integer annee = 0;

    private Prof prof ;
    
    private Salary salary ;
    


    public ClassAverageBonusProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="class_average_bonus_prof_seq")
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
    public Integer getMois(){
        return this.mois;
    }
    public void setMois(Integer mois){
        this.mois = mois;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Salary getSalary(){
        return this.salary;
    }
    public void setSalary(Salary salary){
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassAverageBonusProf classAverageBonusProf = (ClassAverageBonusProf) o;
        return id != null && id.equals(classAverageBonusProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

