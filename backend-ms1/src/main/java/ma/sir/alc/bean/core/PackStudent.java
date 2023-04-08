package ma.sir.alc.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "pack_student")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="pack_student_seq",sequenceName="pack_student_seq",allocationSize=1, initialValue = 1)
public class PackStudent    extends AuditBusinessObject   {

    private Long id;

    private Integer nombreCours = 0;
    @Column(columnDefinition = "boolean default false")
    private Boolean forGroupe = false;
    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String preRequisites;
    @Column(length = 500)
    private String whyTakeThisCourse;
    @Column(length = 500)
    private String expectations;
    @Column(length = 500)
    private String imgUrl;
    private Integer totalStudents = 0;
    @Column(length = 500)
    private String rating;
    @Column(length = 500)
    private String oldPrice;

    private Parcours parcours ;
    
    private Price price ;
    


    public PackStudent(){
        super();
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pack_student_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getNombreCours(){
        return this.nombreCours;
    }
    public void setNombreCours(Integer nombreCours){
        this.nombreCours = nombreCours;
    }
    public Boolean  getForGroupe(){
        return this.forGroupe;
    }
    public void setForGroupe(Boolean forGroupe){
        this.forGroupe = forGroupe;
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getPreRequisites(){
        return this.preRequisites;
    }
    public void setPreRequisites(String preRequisites){
        this.preRequisites = preRequisites;
    }
    public String getWhyTakeThisCourse(){
        return this.whyTakeThisCourse;
    }
    public void setWhyTakeThisCourse(String whyTakeThisCourse){
        this.whyTakeThisCourse = whyTakeThisCourse;
    }
    public String getExpectations(){
        return this.expectations;
    }
    public void setExpectations(String expectations){
        this.expectations = expectations;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    public String getImgUrl(){
        return this.imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Price getPrice(){
        return this.price;
    }
    public void setPrice(Price price){
        this.price = price;
    }
    public Integer getTotalStudents(){
        return this.totalStudents;
    }
    public void setTotalStudents(Integer totalStudents){
        this.totalStudents = totalStudents;
    }
    public String getRating(){
        return this.rating;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public String getOldPrice(){
        return this.oldPrice;
    }
    public void setOldPrice(String oldPrice){
        this.oldPrice = oldPrice;
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
        PackStudent packStudent = (PackStudent) o;
        return id != null && id.equals(packStudent.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

