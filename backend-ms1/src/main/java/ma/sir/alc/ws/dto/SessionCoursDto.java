package  ma.sir.alc.ws.dto;

import ma.sir.alc.zynerator.audit.Log;
import ma.sir.alc.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionCoursDto  extends AuditBaseDto {

    private String reference  ;
    private BigDecimal duree  ;
    private BigDecimal totalheure  ;
    private BigDecimal mois  ;
    private BigDecimal annee  ;
    private String dateFin ;
    private String dateDebut ;
    private Boolean payer  ;

    private ProfDto prof ;
    private CoursDto cours ;
    private GroupeEtudiantDto groupeEtudiant ;
    private SalaryDto salary ;

    private List<SectionDto> sections ;


    public SessionCoursDto(){
        super();
    }



    @Log
    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }

    @Log
    public BigDecimal getDuree(){
        return this.duree;
    }
    public void setDuree(BigDecimal duree){
        this.duree = duree;
    }

    @Log
    public BigDecimal getTotalheure(){
        return this.totalheure;
    }
    public void setTotalheure(BigDecimal totalheure){
        this.totalheure = totalheure;
    }

    @Log
    public BigDecimal getMois(){
        return this.mois;
    }
    public void setMois(BigDecimal mois){
        this.mois = mois;
    }

    @Log
    public BigDecimal getAnnee(){
        return this.annee;
    }
    public void setAnnee(BigDecimal annee){
        this.annee = annee;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    public Boolean getPayer(){
        return this.payer;
    }
    public void setPayer(Boolean payer){
        this.payer = payer;
    }


    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }
    public CoursDto getCours(){
        return this.cours;
    }

    public void setCours(CoursDto cours){
        this.cours = cours;
    }
    public GroupeEtudiantDto getGroupeEtudiant(){
        return this.groupeEtudiant;
    }

    public void setGroupeEtudiant(GroupeEtudiantDto groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }
    public SalaryDto getSalary(){
        return this.salary;
    }

    public void setSalary(SalaryDto salary){
        this.salary = salary;
    }



    public List<SectionDto> getSections(){
        return this.sections;
    }

    public void setSections(List<SectionDto> sections){
        this.sections = sections;
    }

}
