package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Parcours;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.CoursHistory;
import ma.sir.alc.bean.core.Cours;
import ma.sir.alc.ws.dto.CoursDto;

@Component
public class CoursConverter extends AbstractConverter<Cours, CoursDto, CoursHistory> {

    @Autowired
    private SessionCoursConverter sessionCoursConverter ;
    @Autowired
    private HomeWorkConverter homeWorkConverter ;
    @Autowired
    private SectionItemConverter sectionItemConverter ;
    @Autowired
    private EtatCoursConverter etatCoursConverter ;
    @Autowired
    private HomeWorkQuestionConverter homeWorkQuestionConverter ;
    @Autowired
    private ParcoursConverter parcoursConverter ;
    @Autowired
    private CategorieSectionConverter categorieSectionConverter ;
    @Autowired
    private HomeWorkEtudiantConverter homeWorkEtudiantConverter ;
    @Autowired
    private TypeHomeWorkConverter typeHomeWorkConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    private boolean etatCours;
    private boolean parcours;
    private boolean sections;
    private boolean homeWorks;

    public  CoursConverter(){
        super(Cours.class, CoursDto.class, CoursHistory.class);
        init(true);
    }

    @Override
    public Cours toItem(CoursDto dto) {
        if (dto == null) {
            return null;
        } else {
        Cours item = new Cours();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getImage()))
                item.setImage(dto.getImage());
            if(StringUtil.isNotEmpty(dto.getNombreSectionFinalise()))
                item.setNombreSectionFinalise(dto.getNombreSectionFinalise());
            if(StringUtil.isNotEmpty(dto.getNombreSectionEnCours()))
                item.setNombreSectionEnCours(dto.getNombreSectionEnCours());
            if(StringUtil.isNotEmpty(dto.getNombreLinkEnCours()))
                item.setNombreLinkEnCours(dto.getNombreLinkEnCours());
            if(StringUtil.isNotEmpty(dto.getNombreLinkFinalise()))
                item.setNombreLinkFinalise(dto.getNombreLinkFinalise());
            if(StringUtil.isNotEmpty(dto.getNumeroOrder()))
                item.setNumeroOrder(dto.getNumeroOrder());
            if(this.etatCours && dto.getEtatCours()!=null)
                item.setEtatCours(etatCoursConverter.toItem(dto.getEtatCours())) ;

            if(dto.getParcours() != null && dto.getParcours().getId() != null){
                item.setParcours(new Parcours());
                item.getParcours().setId(dto.getParcours().getId());
            }


            if(this.sections && ListUtil.isNotEmpty(dto.getSections()))
                item.setSections(sectionConverter.toItem(dto.getSections()));
            if(this.homeWorks && ListUtil.isNotEmpty(dto.getHomeWorks()))
                item.setHomeWorks(homeWorkConverter.toItem(dto.getHomeWorks()));

        return item;
        }
    }

    @Override
    public CoursDto toDto(Cours item) {
        if (item == null) {
            return null;
        } else {
            CoursDto dto = new CoursDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getImage()))
                dto.setImage(item.getImage());
            if(StringUtil.isNotEmpty(item.getNombreSectionFinalise()))
                dto.setNombreSectionFinalise(item.getNombreSectionFinalise());
            if(StringUtil.isNotEmpty(item.getNombreSectionEnCours()))
                dto.setNombreSectionEnCours(item.getNombreSectionEnCours());
            if(StringUtil.isNotEmpty(item.getNombreLinkEnCours()))
                dto.setNombreLinkEnCours(item.getNombreLinkEnCours());
            if(StringUtil.isNotEmpty(item.getNombreLinkFinalise()))
                dto.setNombreLinkFinalise(item.getNombreLinkFinalise());
            if(StringUtil.isNotEmpty(item.getNumeroOrder()))
                dto.setNumeroOrder(item.getNumeroOrder());
        if(this.etatCours && item.getEtatCours()!=null) {
            dto.setEtatCours(etatCoursConverter.toDto(item.getEtatCours())) ;
        }
        if(this.parcours && item.getParcours()!=null) {
            dto.setParcours(parcoursConverter.toDto(item.getParcours())) ;
        }
        if(this.sections && ListUtil.isNotEmpty(item.getSections())){
            sectionConverter.init(true);
            sectionConverter.setCours(false);
            dto.setSections(sectionConverter.toDto(item.getSections()));
            sectionConverter.setCours(true);

        }
        if(this.homeWorks && ListUtil.isNotEmpty(item.getHomeWorks())){
            homeWorkConverter.init(true);
            homeWorkConverter.setCours(false);
            dto.setHomeWorks(homeWorkConverter.toDto(item.getHomeWorks()));
            homeWorkConverter.setCours(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.sections = value;
        this.homeWorks = value;
    }

    public void initObject(boolean value) {
        this.etatCours = value;
        this.parcours = value;
    }


    public SessionCoursConverter getSessionCoursConverter(){
        return this.sessionCoursConverter;
    }
    public void setSessionCoursConverter(SessionCoursConverter sessionCoursConverter ){
        this.sessionCoursConverter = sessionCoursConverter;
    }
    public HomeWorkConverter getHomeWorkConverter(){
        return this.homeWorkConverter;
    }
    public void setHomeWorkConverter(HomeWorkConverter homeWorkConverter ){
        this.homeWorkConverter = homeWorkConverter;
    }
    public SectionItemConverter getSectionItemConverter(){
        return this.sectionItemConverter;
    }
    public void setSectionItemConverter(SectionItemConverter sectionItemConverter ){
        this.sectionItemConverter = sectionItemConverter;
    }
    public EtatCoursConverter getEtatCoursConverter(){
        return this.etatCoursConverter;
    }
    public void setEtatCoursConverter(EtatCoursConverter etatCoursConverter ){
        this.etatCoursConverter = etatCoursConverter;
    }
    public HomeWorkQuestionConverter getHomeWorkQuestionConverter(){
        return this.homeWorkQuestionConverter;
    }
    public void setHomeWorkQuestionConverter(HomeWorkQuestionConverter homeWorkQuestionConverter ){
        this.homeWorkQuestionConverter = homeWorkQuestionConverter;
    }
    public ParcoursConverter getParcoursConverter(){
        return this.parcoursConverter;
    }
    public void setParcoursConverter(ParcoursConverter parcoursConverter ){
        this.parcoursConverter = parcoursConverter;
    }
    public CategorieSectionConverter getCategorieSectionConverter(){
        return this.categorieSectionConverter;
    }
    public void setCategorieSectionConverter(CategorieSectionConverter categorieSectionConverter ){
        this.categorieSectionConverter = categorieSectionConverter;
    }
    public HomeWorkEtudiantConverter getHomeWorkEtudiantConverter(){
        return this.homeWorkEtudiantConverter;
    }
    public void setHomeWorkEtudiantConverter(HomeWorkEtudiantConverter homeWorkEtudiantConverter ){
        this.homeWorkEtudiantConverter = homeWorkEtudiantConverter;
    }
    public TypeHomeWorkConverter getTypeHomeWorkConverter(){
        return this.typeHomeWorkConverter;
    }
    public void setTypeHomeWorkConverter(TypeHomeWorkConverter typeHomeWorkConverter ){
        this.typeHomeWorkConverter = typeHomeWorkConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public boolean  isEtatCours(){
        return this.etatCours;
    }
    public void  setEtatCours(boolean etatCours){
        this.etatCours = etatCours;
    }
    public boolean  isParcours(){
        return this.parcours;
    }
    public void  setParcours(boolean parcours){
        this.parcours = parcours;
    }
    public boolean  isSections(){
        return this.sections ;
    }
    public void  setSections(boolean sections ){
        this.sections  = sections ;
    }
    public boolean  isHomeWorks(){
        return this.homeWorks ;
    }
    public void  setHomeWorks(boolean homeWorks ){
        this.homeWorks  = homeWorks ;
    }
}
