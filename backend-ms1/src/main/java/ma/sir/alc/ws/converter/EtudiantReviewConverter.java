package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.bean.core.Cours;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.EtudiantReviewHistory;
import ma.sir.alc.bean.core.EtudiantReview;
import ma.sir.alc.ws.dto.EtudiantReviewDto;

@Component
public class EtudiantReviewConverter extends AbstractConverter<EtudiantReview, EtudiantReviewDto, EtudiantReviewHistory> {

    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    private boolean etudiant;
    private boolean prof;
    private boolean cours;

    public  EtudiantReviewConverter(){
        super(EtudiantReview.class, EtudiantReviewDto.class, EtudiantReviewHistory.class);
    }

    @Override
    public EtudiantReview toItem(EtudiantReviewDto dto) {
        if (dto == null) {
            return null;
        } else {
        EtudiantReview item = new EtudiantReview();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getReview()))
                item.setReview(dto.getReview());
            if(StringUtil.isNotEmpty(dto.getComment()))
                item.setComment(dto.getComment());
            if(StringUtil.isNotEmpty(dto.getDateReview()))
                item.setDateReview(DateUtil.stringEnToDate(dto.getDateReview()));
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }

            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(dto.getCours() != null && dto.getCours().getId() != null){
                item.setCours(new Cours());
                item.getCours().setId(dto.getCours().getId());
            }



        return item;
        }
    }

    @Override
    public EtudiantReviewDto toDto(EtudiantReview item) {
        if (item == null) {
            return null;
        } else {
            EtudiantReviewDto dto = new EtudiantReviewDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getReview()))
                dto.setReview(item.getReview());
            if(StringUtil.isNotEmpty(item.getComment()))
                dto.setComment(item.getComment());
            if(item.getDateReview()!=null)
                dto.setDateReview(DateUtil.dateTimeToString(item.getDateReview()));
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.cours && item.getCours()!=null) {
            dto.setCours(coursConverter.toDto(item.getCours())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etudiant = value;
        this.prof = value;
        this.cours = value;
    }


    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isCours(){
        return this.cours;
    }
    public void  setCours(boolean cours){
        this.cours = cours;
    }
}
