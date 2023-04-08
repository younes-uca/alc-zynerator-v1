package ma.sir.alc.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="section_seq",sequenceName="section_seq",allocationSize=1, initialValue = 1)
public class Section    extends AuditBusinessObject   {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String urlImage;
    @Column(length = 500)
    private String urlImage2;
    @Column(length = 500)
    private String urlImage3;
    @Column(length = 500)
    private String urlVideo;
    @Column(length = 500)
    private String contenu;
    @Column(length = 500)
    private String questions;
    @Column(length = 500)
    private String indicationProf;
    private Integer numeroOrder = 0;
    private Integer url = 0;
    private Integer content = 0;

    private CategorieSection categorieSection ;
    
    private Cours cours ;
    
    private SessionCours sessionCours ;
    

    private List<SectionItem> sectionItems ;

    public Section(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="section_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getUrlImage(){
        return this.urlImage;
    }
    public void setUrlImage(String urlImage){
        this.urlImage = urlImage;
    }
    public String getUrlImage2(){
        return this.urlImage2;
    }
    public void setUrlImage2(String urlImage2){
        this.urlImage2 = urlImage2;
    }
    public String getUrlImage3(){
        return this.urlImage3;
    }
    public void setUrlImage3(String urlImage3){
        this.urlImage3 = urlImage3;
    }
    public String getUrlVideo(){
        return this.urlVideo;
    }
    public void setUrlVideo(String urlVideo){
        this.urlVideo = urlVideo;
    }
    public String getContenu(){
        return this.contenu;
    }
    public void setContenu(String contenu){
        this.contenu = contenu;
    }
    public String getQuestions(){
        return this.questions;
    }
    public void setQuestions(String questions){
        this.questions = questions;
    }
    public String getIndicationProf(){
        return this.indicationProf;
    }
    public void setIndicationProf(String indicationProf){
        this.indicationProf = indicationProf;
    }
    public Integer getNumeroOrder(){
        return this.numeroOrder;
    }
    public void setNumeroOrder(Integer numeroOrder){
        this.numeroOrder = numeroOrder;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieSection getCategorieSection(){
        return this.categorieSection;
    }
    public void setCategorieSection(CategorieSection categorieSection){
        this.categorieSection = categorieSection;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Cours getCours(){
        return this.cours;
    }
    public void setCours(Cours cours){
        this.cours = cours;
    }
    public Integer getUrl(){
        return this.url;
    }
    public void setUrl(Integer url){
        this.url = url;
    }
    public Integer getContent(){
        return this.content;
    }
    public void setContent(Integer content){
        this.content = content;
    }
    @OneToMany(mappedBy = "section")
    public List<SectionItem> getSectionItems(){
        return this.sectionItems;
    }
    public void setSectionItems(List<SectionItem> sectionItems){
        this.sectionItems = sectionItems;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public SessionCours getSessionCours(){
        return this.sessionCours;
    }
    public void setSessionCours(SessionCours sessionCours){
        this.sessionCours = sessionCours;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return id != null && id.equals(section.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

