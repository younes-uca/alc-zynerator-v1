package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.CategorieSection;
import ma.sir.alc.bean.core.Cours;
import ma.sir.alc.bean.core.SessionCours;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.SectionHistory;
import ma.sir.alc.bean.core.Section;
import ma.sir.alc.ws.dto.SectionDto;

@Component
public class SectionConverter extends AbstractConverter<Section, SectionDto, SectionHistory> {

    @Autowired
    private SessionCoursConverter sessionCoursConverter ;
    @Autowired
    private CategorieSectionConverter categorieSectionConverter ;
    @Autowired
    private CoursConverter coursConverter ;
    @Autowired
    private SectionItemConverter sectionItemConverter ;
    private boolean categorieSection;
    private boolean cours;
    private boolean sessionCours;
    private boolean sectionItems;

    public  SectionConverter(){
        super(Section.class, SectionDto.class, SectionHistory.class);
        init(true);
    }

    @Override
    public Section toItem(SectionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Section item = new Section();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getUrlImage()))
                item.setUrlImage(dto.getUrlImage());
            if(StringUtil.isNotEmpty(dto.getUrlImage2()))
                item.setUrlImage2(dto.getUrlImage2());
            if(StringUtil.isNotEmpty(dto.getUrlImage3()))
                item.setUrlImage3(dto.getUrlImage3());
            if(StringUtil.isNotEmpty(dto.getUrlVideo()))
                item.setUrlVideo(dto.getUrlVideo());
            if(StringUtil.isNotEmpty(dto.getContenu()))
                item.setContenu(dto.getContenu());
            if(StringUtil.isNotEmpty(dto.getQuestions()))
                item.setQuestions(dto.getQuestions());
            if(StringUtil.isNotEmpty(dto.getIndicationProf()))
                item.setIndicationProf(dto.getIndicationProf());
            if(StringUtil.isNotEmpty(dto.getNumeroOrder()))
                item.setNumeroOrder(dto.getNumeroOrder());
            if(StringUtil.isNotEmpty(dto.getUrl()))
                item.setUrl(dto.getUrl());
            if(StringUtil.isNotEmpty(dto.getContent()))
                item.setContent(dto.getContent());
            if(dto.getCategorieSection() != null && dto.getCategorieSection().getId() != null){
                item.setCategorieSection(new CategorieSection());
                item.getCategorieSection().setId(dto.getCategorieSection().getId());
            }

            if(dto.getCours() != null && dto.getCours().getId() != null){
                item.setCours(new Cours());
                item.getCours().setId(dto.getCours().getId());
            }

            if(dto.getSessionCours() != null && dto.getSessionCours().getId() != null){
                item.setSessionCours(new SessionCours());
                item.getSessionCours().setId(dto.getSessionCours().getId());
            }


            if(this.sectionItems && ListUtil.isNotEmpty(dto.getSectionItems()))
                item.setSectionItems(sectionItemConverter.toItem(dto.getSectionItems()));

        return item;
        }
    }

    @Override
    public SectionDto toDto(Section item) {
        if (item == null) {
            return null;
        } else {
            SectionDto dto = new SectionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getUrlImage()))
                dto.setUrlImage(item.getUrlImage());
            if(StringUtil.isNotEmpty(item.getUrlImage2()))
                dto.setUrlImage2(item.getUrlImage2());
            if(StringUtil.isNotEmpty(item.getUrlImage3()))
                dto.setUrlImage3(item.getUrlImage3());
            if(StringUtil.isNotEmpty(item.getUrlVideo()))
                dto.setUrlVideo(item.getUrlVideo());
            if(StringUtil.isNotEmpty(item.getContenu()))
                dto.setContenu(item.getContenu());
            if(StringUtil.isNotEmpty(item.getQuestions()))
                dto.setQuestions(item.getQuestions());
            if(StringUtil.isNotEmpty(item.getIndicationProf()))
                dto.setIndicationProf(item.getIndicationProf());
            if(StringUtil.isNotEmpty(item.getNumeroOrder()))
                dto.setNumeroOrder(item.getNumeroOrder());
            if(StringUtil.isNotEmpty(item.getUrl()))
                dto.setUrl(item.getUrl());
            if(StringUtil.isNotEmpty(item.getContent()))
                dto.setContent(item.getContent());
        if(this.categorieSection && item.getCategorieSection()!=null) {
            dto.setCategorieSection(categorieSectionConverter.toDto(item.getCategorieSection())) ;
        }
        if(this.cours && item.getCours()!=null) {
            dto.setCours(coursConverter.toDto(item.getCours())) ;
        }
        if(this.sessionCours && item.getSessionCours()!=null) {
            dto.setSessionCours(sessionCoursConverter.toDto(item.getSessionCours())) ;
        }
        if(this.sectionItems && ListUtil.isNotEmpty(item.getSectionItems())){
            sectionItemConverter.init(true);
            sectionItemConverter.setSection(false);
            dto.setSectionItems(sectionItemConverter.toDto(item.getSectionItems()));
            sectionItemConverter.setSection(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.sectionItems = value;
    }

    public void initObject(boolean value) {
        this.categorieSection = value;
        this.cours = value;
        this.sessionCours = value;
    }


    public SessionCoursConverter getSessionCoursConverter(){
        return this.sessionCoursConverter;
    }
    public void setSessionCoursConverter(SessionCoursConverter sessionCoursConverter ){
        this.sessionCoursConverter = sessionCoursConverter;
    }
    public CategorieSectionConverter getCategorieSectionConverter(){
        return this.categorieSectionConverter;
    }
    public void setCategorieSectionConverter(CategorieSectionConverter categorieSectionConverter ){
        this.categorieSectionConverter = categorieSectionConverter;
    }
    public CoursConverter getCoursConverter(){
        return this.coursConverter;
    }
    public void setCoursConverter(CoursConverter coursConverter ){
        this.coursConverter = coursConverter;
    }
    public SectionItemConverter getSectionItemConverter(){
        return this.sectionItemConverter;
    }
    public void setSectionItemConverter(SectionItemConverter sectionItemConverter ){
        this.sectionItemConverter = sectionItemConverter;
    }
    public boolean  isCategorieSection(){
        return this.categorieSection;
    }
    public void  setCategorieSection(boolean categorieSection){
        this.categorieSection = categorieSection;
    }
    public boolean  isCours(){
        return this.cours;
    }
    public void  setCours(boolean cours){
        this.cours = cours;
    }
    public boolean  isSessionCours(){
        return this.sessionCours;
    }
    public void  setSessionCours(boolean sessionCours){
        this.sessionCours = sessionCours;
    }
    public boolean  isSectionItems(){
        return this.sectionItems ;
    }
    public void  setSectionItems(boolean sectionItems ){
        this.sectionItems  = sectionItems ;
    }
}
