package  ma.sir.alc.dao.criteria.core;


import ma.sir.alc.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class HomeWorkEtudiantCriteria extends  BaseCriteria  {

    private String note;
    private String noteMin;
    private String noteMax;
    private LocalDateTime dateHomeWork;
    private LocalDateTime dateHomeWorkFrom;
    private LocalDateTime dateHomeWorkTo;

    private EtudiantCriteria etudiant ;
    private List<EtudiantCriteria> etudiants ;
    private HomeWorkCriteria homeWork ;
    private List<HomeWorkCriteria> homeWorks ;
    private ResultatHomeWorkCriteria resultatHomeWork ;
    private List<ResultatHomeWorkCriteria> resultatHomeWorks ;


    public HomeWorkEtudiantCriteria(){}

    public String getNote(){
        return this.note;
    }
    public void setNote(String note){
        this.note = note;
    }   
    public String getNoteMin(){
        return this.noteMin;
    }
    public void setNoteMin(String noteMin){
        this.noteMin = noteMin;
    }
    public String getNoteMax(){
        return this.noteMax;
    }
    public void setNoteMax(String noteMax){
        this.noteMax = noteMax;
    }
      
    public LocalDateTime getDateHomeWork(){
        return this.dateHomeWork;
    }
    public void setDateHomeWork(LocalDateTime dateHomeWork){
        this.dateHomeWork = dateHomeWork;
    }
    public LocalDateTime getDateHomeWorkFrom(){
        return this.dateHomeWorkFrom;
    }
    public void setDateHomeWorkFrom(LocalDateTime dateHomeWorkFrom){
        this.dateHomeWorkFrom = dateHomeWorkFrom;
    }
    public LocalDateTime getDateHomeWorkTo(){
        return this.dateHomeWorkTo;
    }
    public void setDateHomeWorkTo(LocalDateTime dateHomeWorkTo){
        this.dateHomeWorkTo = dateHomeWorkTo;
    }

    public EtudiantCriteria getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantCriteria etudiant){
        this.etudiant = etudiant;
    }
    public List<EtudiantCriteria> getEtudiants(){
        return this.etudiants;
    }

    public void setEtudiants(List<EtudiantCriteria> etudiants){
        this.etudiants = etudiants;
    }
    public HomeWorkCriteria getHomeWork(){
        return this.homeWork;
    }

    public void setHomeWork(HomeWorkCriteria homeWork){
        this.homeWork = homeWork;
    }
    public List<HomeWorkCriteria> getHomeWorks(){
        return this.homeWorks;
    }

    public void setHomeWorks(List<HomeWorkCriteria> homeWorks){
        this.homeWorks = homeWorks;
    }
    public ResultatHomeWorkCriteria getResultatHomeWork(){
        return this.resultatHomeWork;
    }

    public void setResultatHomeWork(ResultatHomeWorkCriteria resultatHomeWork){
        this.resultatHomeWork = resultatHomeWork;
    }
    public List<ResultatHomeWorkCriteria> getResultatHomeWorks(){
        return this.resultatHomeWorks;
    }

    public void setResultatHomeWorks(List<ResultatHomeWorkCriteria> resultatHomeWorks){
        this.resultatHomeWorks = resultatHomeWorks;
    }
}
