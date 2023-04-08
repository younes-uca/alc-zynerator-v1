package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "home_work_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="home_work_etudiant_seq",sequenceName="home_work_etudiant_seq",allocationSize=1, initialValue = 1)
public class HomeWorkEtudiant    extends AuditBusinessObject   {

    private Long id;

    private BigDecimal note = BigDecimal.ZERO;
    private LocalDateTime dateHomeWork ;

    private Etudiant etudiant ;
    
    private HomeWork homeWork ;
    
    private ResultatHomeWork resultatHomeWork ;
    

    private List<ReponseEtudiantHomeWork> reponseEtudiantHomeWorks ;

    public HomeWorkEtudiant(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="home_work_etudiant_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Etudiant getEtudiant(){
        return this.etudiant;
    }
    public void setEtudiant(Etudiant etudiant){
        this.etudiant = etudiant;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public HomeWork getHomeWork(){
        return this.homeWork;
    }
    public void setHomeWork(HomeWork homeWork){
        this.homeWork = homeWork;
    }
    @OneToMany(mappedBy = "homeWorkEtudiant")
    public List<ReponseEtudiantHomeWork> getReponseEtudiantHomeWorks(){
        return this.reponseEtudiantHomeWorks;
    }
    public void setReponseEtudiantHomeWorks(List<ReponseEtudiantHomeWork> reponseEtudiantHomeWorks){
        this.reponseEtudiantHomeWorks = reponseEtudiantHomeWorks;
    }
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ResultatHomeWork getResultatHomeWork(){
        return this.resultatHomeWork;
    }
    public void setResultatHomeWork(ResultatHomeWork resultatHomeWork){
        this.resultatHomeWork = resultatHomeWork;
    }
    public LocalDateTime getDateHomeWork(){
        return this.dateHomeWork;
    }
    public void setDateHomeWork(LocalDateTime dateHomeWork){
        this.dateHomeWork = dateHomeWork;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeWorkEtudiant homeWorkEtudiant = (HomeWorkEtudiant) o;
        return id != null && id.equals(homeWorkEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

