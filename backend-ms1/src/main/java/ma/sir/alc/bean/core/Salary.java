package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "salary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="salary_seq",sequenceName="salary_seq",allocationSize=1, initialValue = 1)
public class Salary    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer mois = 0;
    private Integer annee = 0;
    private BigDecimal nbrSessionMensuel = BigDecimal.ZERO;
    @Column(columnDefinition = "boolean default false")
    private Boolean payer = false;
    private BigDecimal totalPayment = BigDecimal.ZERO;
    private BigDecimal totalBonusClassAverage = BigDecimal.ZERO;
    private BigDecimal totalBonusWorkload = BigDecimal.ZERO;

    private Prof prof ;
    


    public Salary(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="salary_seq")
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
    public BigDecimal getNbrSessionMensuel(){
        return this.nbrSessionMensuel;
    }
    public void setNbrSessionMensuel(BigDecimal nbrSessionMensuel){
        this.nbrSessionMensuel = nbrSessionMensuel;
    }
    public Boolean  getPayer(){
        return this.payer;
    }
    public void setPayer(Boolean payer){
        this.payer = payer;
    }
    public BigDecimal getTotalPayment(){
        return this.totalPayment;
    }
    public void setTotalPayment(BigDecimal totalPayment){
        this.totalPayment = totalPayment;
    }
    public BigDecimal getTotalBonusClassAverage(){
        return this.totalBonusClassAverage;
    }
    public void setTotalBonusClassAverage(BigDecimal totalBonusClassAverage){
        this.totalBonusClassAverage = totalBonusClassAverage;
    }
    public BigDecimal getTotalBonusWorkload(){
        return this.totalBonusWorkload;
    }
    public void setTotalBonusWorkload(BigDecimal totalBonusWorkload){
        this.totalBonusWorkload = totalBonusWorkload;
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
        Salary salary = (Salary) o;
        return id != null && id.equals(salary.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

