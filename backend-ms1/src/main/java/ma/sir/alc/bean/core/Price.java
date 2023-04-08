package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "price")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="price_seq",sequenceName="price_seq",allocationSize=1, initialValue = 1)
public class Price    extends AuditBusinessObject   {

    private Long id;

    private BigDecimal price = BigDecimal.ZERO;
    private BigDecimal oldPrice = BigDecimal.ZERO;
    @Column(length = 500)
    private String lib;
    private BigDecimal nreCourse = BigDecimal.ZERO;
    private BigDecimal nreHours = BigDecimal.ZERO;
    private BigDecimal nreMonth = BigDecimal.ZERO;
    @Column(columnDefinition = "boolean default false")
    private Boolean forGroup = false;



    public Price(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="price_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }
    public BigDecimal getOldPrice(){
        return this.oldPrice;
    }
    public void setOldPrice(BigDecimal oldPrice){
        this.oldPrice = oldPrice;
    }
    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }
    public BigDecimal getNreCourse(){
        return this.nreCourse;
    }
    public void setNreCourse(BigDecimal nreCourse){
        this.nreCourse = nreCourse;
    }
    public BigDecimal getNreHours(){
        return this.nreHours;
    }
    public void setNreHours(BigDecimal nreHours){
        this.nreHours = nreHours;
    }
    public BigDecimal getNreMonth(){
        return this.nreMonth;
    }
    public void setNreMonth(BigDecimal nreMonth){
        this.nreMonth = nreMonth;
    }
    public Boolean  getForGroup(){
        return this.forGroup;
    }
    public void setForGroup(Boolean forGroup){
        this.forGroup = forGroup;
    }

    @Transient
    public String getLabel() {
        label = lib;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return id != null && id.equals(price.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

