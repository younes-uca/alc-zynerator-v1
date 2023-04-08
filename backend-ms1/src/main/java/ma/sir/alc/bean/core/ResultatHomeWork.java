package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "resultat_home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="resultat_home_work_seq",sequenceName="resultat_home_work_seq",allocationSize=1, initialValue = 1)
public class ResultatHomeWork    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;



    public ResultatHomeWork(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="resultat_home_work_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultatHomeWork resultatHomeWork = (ResultatHomeWork) o;
        return id != null && id.equals(resultatHomeWork.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

