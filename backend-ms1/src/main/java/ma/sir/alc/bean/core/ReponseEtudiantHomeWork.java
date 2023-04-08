package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "reponse_etudiant_home_work")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reponse_etudiant_home_work_seq",sequenceName="reponse_etudiant_home_work_seq",allocationSize=1, initialValue = 1)
public class ReponseEtudiantHomeWork    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String answer;
    @Column(length = 500)
    private String profNote;
    private BigDecimal note = BigDecimal.ZERO;

    private HoweWorkQSTReponse howeWorkQSTReponse ;
    
    private HomeWorkEtudiant homeWorkEtudiant ;
    
    private HomeWorkQuestion homeWorkQuestion ;
    


    public ReponseEtudiantHomeWork(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reponse_etudiant_home_work_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public HoweWorkQSTReponse getHoweWorkQSTReponse(){
        return this.howeWorkQSTReponse;
    }
    public void setHoweWorkQSTReponse(HoweWorkQSTReponse howeWorkQSTReponse){
        this.howeWorkQSTReponse = howeWorkQSTReponse;
    }
    public String getAnswer(){
        return this.answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public HomeWorkEtudiant getHomeWorkEtudiant(){
        return this.homeWorkEtudiant;
    }
    public void setHomeWorkEtudiant(HomeWorkEtudiant homeWorkEtudiant){
        this.homeWorkEtudiant = homeWorkEtudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public HomeWorkQuestion getHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }
    public void setHomeWorkQuestion(HomeWorkQuestion homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
    }
    public String getProfNote(){
        return this.profNote;
    }
    public void setProfNote(String profNote){
        this.profNote = profNote;
    }
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReponseEtudiantHomeWork reponseEtudiantHomeWork = (ReponseEtudiantHomeWork) o;
        return id != null && id.equals(reponseEtudiantHomeWork.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

