package  ma.sir.alc.dao.criteria.core;


import ma.sir.alc.zynerator.criteria.BaseCriteria;
import java.util.List;

public class HoweWorkQSTReponseCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String lib;
    private String libLike;
    private String numero;
    private String numeroMin;
    private String numeroMax;

    private EtatReponseCriteria etatReponse ;
    private List<EtatReponseCriteria> etatReponses ;
    private HomeWorkQuestionCriteria homeWorkQuestion ;
    private List<HomeWorkQuestionCriteria> homeWorkQuestions ;


    public HoweWorkQSTReponseCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }
    public String getLibLike(){
        return this.libLike;
    }
    public void setLibLike(String libLike){
        this.libLike = libLike;
    }

    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }   
    public String getNumeroMin(){
        return this.numeroMin;
    }
    public void setNumeroMin(String numeroMin){
        this.numeroMin = numeroMin;
    }
    public String getNumeroMax(){
        return this.numeroMax;
    }
    public void setNumeroMax(String numeroMax){
        this.numeroMax = numeroMax;
    }
      

    public EtatReponseCriteria getEtatReponse(){
        return this.etatReponse;
    }

    public void setEtatReponse(EtatReponseCriteria etatReponse){
        this.etatReponse = etatReponse;
    }
    public List<EtatReponseCriteria> getEtatReponses(){
        return this.etatReponses;
    }

    public void setEtatReponses(List<EtatReponseCriteria> etatReponses){
        this.etatReponses = etatReponses;
    }
    public HomeWorkQuestionCriteria getHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }

    public void setHomeWorkQuestion(HomeWorkQuestionCriteria homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
    }
    public List<HomeWorkQuestionCriteria> getHomeWorkQuestions(){
        return this.homeWorkQuestions;
    }

    public void setHomeWorkQuestions(List<HomeWorkQuestionCriteria> homeWorkQuestions){
        this.homeWorkQuestions = homeWorkQuestions;
    }
}
