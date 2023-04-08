package ma.sir.alc.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.alc.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "super_categorie_section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="super_categorie_section_seq",sequenceName="super_categorie_section_seq",allocationSize=1, initialValue = 1)
public class SuperCategorieSectionHistory extends HistBusinessObject  {


    public SuperCategorieSectionHistory() {
    super();
    }

    public SuperCategorieSectionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="super_categorie_section_seq")
    public Long getId() {
    return id;
    }
}

