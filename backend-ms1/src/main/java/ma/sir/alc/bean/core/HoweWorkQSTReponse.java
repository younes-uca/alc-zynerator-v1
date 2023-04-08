package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "howe_work_q_s_t_reponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="howe_work_q_s_t_reponse_seq",sequenceName="howe_work_q_s_t_reponse_seq",allocationSize=1, initialValue = 1)
public class HoweWorkQSTReponse    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String lib;
    private Integer numero = 0;

    private EtatReponse etatReponse ;
    
    private HomeWorkQuestion homeWorkQuestion ;
    


    public HoweWorkQSTReponse(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="howe_work_q_s_t_reponse_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EtatReponse getEtatReponse(){
        return this.etatReponse;
    }
    public void setEtatReponse(EtatReponse etatReponse){
        this.etatReponse = etatReponse;
    }
    public Integer getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public HomeWorkQuestion getHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }
    public void setHomeWorkQuestion(HomeWorkQuestion homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
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
        HoweWorkQSTReponse howeWorkQSTReponse = (HoweWorkQSTReponse) o;
        return id != null && id.equals(howeWorkQSTReponse.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

