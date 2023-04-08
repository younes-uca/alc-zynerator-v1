package  ma.sir.alc.dao.criteria.core;


import ma.sir.alc.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EtatEtudiantCriteria extends  BaseCriteria  {

    private String reference;
    private String referenceLike;
    private String username;
    private String usernameLike;
    private String firstName;
    private String firstNameLike;
    private String lastName;
    private String lastNameLike;
    private String nationnalite;
    private String nationnaliteLike;
    private String schedule1;
    private String schedule1Like;
    private String schedule2;
    private String schedule2Like;
    private String lastClass;
    private String lastClassLike;
    private String nbrClass;
    private String nbrClassLike;
    private String etat;
    private String etatLike;
    private String etatNumber;
    private String etatNumberMin;
    private String etatNumberMax;



    public EtatEtudiantCriteria(){}

    public String getReference(){
        return this.reference;
    }
    public void setReference(String reference){
        this.reference = reference;
    }
    public String getReferenceLike(){
        return this.referenceLike;
    }
    public void setReferenceLike(String referenceLike){
        this.referenceLike = referenceLike;
    }

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsernameLike(){
        return this.usernameLike;
    }
    public void setUsernameLike(String usernameLike){
        this.usernameLike = usernameLike;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstNameLike(){
        return this.firstNameLike;
    }
    public void setFirstNameLike(String firstNameLike){
        this.firstNameLike = firstNameLike;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastNameLike(){
        return this.lastNameLike;
    }
    public void setLastNameLike(String lastNameLike){
        this.lastNameLike = lastNameLike;
    }

    public String getNationnalite(){
        return this.nationnalite;
    }
    public void setNationnalite(String nationnalite){
        this.nationnalite = nationnalite;
    }
    public String getNationnaliteLike(){
        return this.nationnaliteLike;
    }
    public void setNationnaliteLike(String nationnaliteLike){
        this.nationnaliteLike = nationnaliteLike;
    }

    public String getSchedule1(){
        return this.schedule1;
    }
    public void setSchedule1(String schedule1){
        this.schedule1 = schedule1;
    }
    public String getSchedule1Like(){
        return this.schedule1Like;
    }
    public void setSchedule1Like(String schedule1Like){
        this.schedule1Like = schedule1Like;
    }

    public String getSchedule2(){
        return this.schedule2;
    }
    public void setSchedule2(String schedule2){
        this.schedule2 = schedule2;
    }
    public String getSchedule2Like(){
        return this.schedule2Like;
    }
    public void setSchedule2Like(String schedule2Like){
        this.schedule2Like = schedule2Like;
    }

    public String getLastClass(){
        return this.lastClass;
    }
    public void setLastClass(String lastClass){
        this.lastClass = lastClass;
    }
    public String getLastClassLike(){
        return this.lastClassLike;
    }
    public void setLastClassLike(String lastClassLike){
        this.lastClassLike = lastClassLike;
    }

    public String getNbrClass(){
        return this.nbrClass;
    }
    public void setNbrClass(String nbrClass){
        this.nbrClass = nbrClass;
    }
    public String getNbrClassLike(){
        return this.nbrClassLike;
    }
    public void setNbrClassLike(String nbrClassLike){
        this.nbrClassLike = nbrClassLike;
    }

    public String getEtat(){
        return this.etat;
    }
    public void setEtat(String etat){
        this.etat = etat;
    }
    public String getEtatLike(){
        return this.etatLike;
    }
    public void setEtatLike(String etatLike){
        this.etatLike = etatLike;
    }

    public String getEtatNumber(){
        return this.etatNumber;
    }
    public void setEtatNumber(String etatNumber){
        this.etatNumber = etatNumber;
    }   
    public String getEtatNumberMin(){
        return this.etatNumberMin;
    }
    public void setEtatNumberMin(String etatNumberMin){
        this.etatNumberMin = etatNumberMin;
    }
    public String getEtatNumberMax(){
        return this.etatNumberMax;
    }
    public void setEtatNumberMax(String etatNumberMax){
        this.etatNumberMax = etatNumberMax;
    }
      

}
