package ma.sir.alc.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "news")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="news_seq",sequenceName="news_seq",allocationSize=1, initialValue = 1)
public class News    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String image;
    @Column(length = 500)
    private String description;
    private LocalDateTime dateNews ;
    private LocalDateTime dateDebut ;
    private LocalDateTime dateFin ;
    private Integer numeroOrdre = 0;
    @Column(length = 500)
    private String destinataire;



    public News(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="news_seq")
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getImage(){
        return this.image;
    }
    public void setImage(String image){
        this.image = image;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public LocalDateTime getDateNews(){
        return this.dateNews;
    }
    public void setDateNews(LocalDateTime dateNews){
        this.dateNews = dateNews;
    }
    public LocalDateTime getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(LocalDateTime dateDebut){
        this.dateDebut = dateDebut;
    }
    public LocalDateTime getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(LocalDateTime dateFin){
        this.dateFin = dateFin;
    }
    public Integer getNumeroOrdre(){
        return this.numeroOrdre;
    }
    public void setNumeroOrdre(Integer numeroOrdre){
        this.numeroOrdre = numeroOrdre;
    }
    public String getDestinataire(){
        return this.destinataire;
    }
    public void setDestinataire(String destinataire){
        this.destinataire = destinataire;
    }

    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id != null && id.equals(news.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

