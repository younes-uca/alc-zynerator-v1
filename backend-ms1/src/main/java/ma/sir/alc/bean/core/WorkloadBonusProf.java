package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "workload_bonus_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="workload_bonus_prof_seq",sequenceName="workload_bonus_prof_seq",allocationSize=1, initialValue = 1)
public class WorkloadBonusProf    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer nombreSession = 0;
    private BigDecimal prix = BigDecimal.ZERO;



    public WorkloadBonusProf(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workload_bonus_prof_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public Integer getNombreSession(){
        return this.nombreSession;
    }
    public void setNombreSession(Integer nombreSession){
        this.nombreSession = nombreSession;
    }
    public BigDecimal getPrix(){
        return this.prix;
    }
    public void setPrix(BigDecimal prix){
        this.prix = prix;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkloadBonusProf workloadBonusProf = (WorkloadBonusProf) o;
        return id != null && id.equals(workloadBonusProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

