package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.bean.core.HomeWork;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.HomeWorkEtudiantHistory;
import ma.sir.alc.bean.core.HomeWorkEtudiant;
import ma.sir.alc.ws.dto.HomeWorkEtudiantDto;

@Component
public class HomeWorkEtudiantConverter extends AbstractConverter<HomeWorkEtudiant, HomeWorkEtudiantDto, HomeWorkEtudiantHistory> {

    @Autowired
    private HoweWorkQSTReponseConverter howeWorkQSTReponseConverter ;
    @Autowired
    private EtudiantConverter etudiantConverter ;
    @Autowired
    private HomeWorkQuestionConverter homeWorkQuestionConverter ;
    @Autowired
    private ResultatHomeWorkConverter resultatHomeWorkConverter ;
    @Autowired
    private HomeWorkConverter homeWorkConverter ;
    @Autowired
    private ReponseEtudiantHomeWorkConverter reponseEtudiantHomeWorkConverter ;
    private boolean etudiant;
    private boolean homeWork;
    private boolean resultatHomeWork;
    private boolean reponseEtudiantHomeWorks;

    public  HomeWorkEtudiantConverter(){
        super(HomeWorkEtudiant.class, HomeWorkEtudiantDto.class, HomeWorkEtudiantHistory.class);
        init(true);
    }

    @Override
    public HomeWorkEtudiant toItem(HomeWorkEtudiantDto dto) {
        if (dto == null) {
            return null;
        } else {
        HomeWorkEtudiant item = new HomeWorkEtudiant();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getNote()))
                item.setNote(dto.getNote());
            if(StringUtil.isNotEmpty(dto.getDateHomeWork()))
                item.setDateHomeWork(DateUtil.stringEnToDate(dto.getDateHomeWork()));
            if(dto.getEtudiant() != null && dto.getEtudiant().getId() != null){
                item.setEtudiant(new Etudiant());
                item.getEtudiant().setId(dto.getEtudiant().getId());
            }

            if(dto.getHomeWork() != null && dto.getHomeWork().getId() != null){
                item.setHomeWork(new HomeWork());
                item.getHomeWork().setId(dto.getHomeWork().getId());
            }

            if(this.resultatHomeWork && dto.getResultatHomeWork()!=null)
                item.setResultatHomeWork(resultatHomeWorkConverter.toItem(dto.getResultatHomeWork())) ;


            if(this.reponseEtudiantHomeWorks && ListUtil.isNotEmpty(dto.getReponseEtudiantHomeWorks()))
                item.setReponseEtudiantHomeWorks(reponseEtudiantHomeWorkConverter.toItem(dto.getReponseEtudiantHomeWorks()));

        return item;
        }
    }

    @Override
    public HomeWorkEtudiantDto toDto(HomeWorkEtudiant item) {
        if (item == null) {
            return null;
        } else {
            HomeWorkEtudiantDto dto = new HomeWorkEtudiantDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getNote()))
                dto.setNote(item.getNote());
            if(item.getDateHomeWork()!=null)
                dto.setDateHomeWork(DateUtil.dateTimeToString(item.getDateHomeWork()));
        if(this.etudiant && item.getEtudiant()!=null) {
            dto.setEtudiant(etudiantConverter.toDto(item.getEtudiant())) ;
        }
        if(this.homeWork && item.getHomeWork()!=null) {
            dto.setHomeWork(homeWorkConverter.toDto(item.getHomeWork())) ;
        }
        if(this.resultatHomeWork && item.getResultatHomeWork()!=null) {
            dto.setResultatHomeWork(resultatHomeWorkConverter.toDto(item.getResultatHomeWork())) ;
        }
        if(this.reponseEtudiantHomeWorks && ListUtil.isNotEmpty(item.getReponseEtudiantHomeWorks())){
            reponseEtudiantHomeWorkConverter.init(true);
            reponseEtudiantHomeWorkConverter.setHomeWorkEtudiant(false);
            dto.setReponseEtudiantHomeWorks(reponseEtudiantHomeWorkConverter.toDto(item.getReponseEtudiantHomeWorks()));
            reponseEtudiantHomeWorkConverter.setHomeWorkEtudiant(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.reponseEtudiantHomeWorks = value;
    }

    public void initObject(boolean value) {
        this.etudiant = value;
        this.homeWork = value;
        this.resultatHomeWork = value;
    }


    public HoweWorkQSTReponseConverter getHoweWorkQSTReponseConverter(){
        return this.howeWorkQSTReponseConverter;
    }
    public void setHoweWorkQSTReponseConverter(HoweWorkQSTReponseConverter howeWorkQSTReponseConverter ){
        this.howeWorkQSTReponseConverter = howeWorkQSTReponseConverter;
    }
    public EtudiantConverter getEtudiantConverter(){
        return this.etudiantConverter;
    }
    public void setEtudiantConverter(EtudiantConverter etudiantConverter ){
        this.etudiantConverter = etudiantConverter;
    }
    public HomeWorkQuestionConverter getHomeWorkQuestionConverter(){
        return this.homeWorkQuestionConverter;
    }
    public void setHomeWorkQuestionConverter(HomeWorkQuestionConverter homeWorkQuestionConverter ){
        this.homeWorkQuestionConverter = homeWorkQuestionConverter;
    }
    public ResultatHomeWorkConverter getResultatHomeWorkConverter(){
        return this.resultatHomeWorkConverter;
    }
    public void setResultatHomeWorkConverter(ResultatHomeWorkConverter resultatHomeWorkConverter ){
        this.resultatHomeWorkConverter = resultatHomeWorkConverter;
    }
    public HomeWorkConverter getHomeWorkConverter(){
        return this.homeWorkConverter;
    }
    public void setHomeWorkConverter(HomeWorkConverter homeWorkConverter ){
        this.homeWorkConverter = homeWorkConverter;
    }
    public ReponseEtudiantHomeWorkConverter getReponseEtudiantHomeWorkConverter(){
        return this.reponseEtudiantHomeWorkConverter;
    }
    public void setReponseEtudiantHomeWorkConverter(ReponseEtudiantHomeWorkConverter reponseEtudiantHomeWorkConverter ){
        this.reponseEtudiantHomeWorkConverter = reponseEtudiantHomeWorkConverter;
    }
    public boolean  isEtudiant(){
        return this.etudiant;
    }
    public void  setEtudiant(boolean etudiant){
        this.etudiant = etudiant;
    }
    public boolean  isHomeWork(){
        return this.homeWork;
    }
    public void  setHomeWork(boolean homeWork){
        this.homeWork = homeWork;
    }
    public boolean  isResultatHomeWork(){
        return this.resultatHomeWork;
    }
    public void  setResultatHomeWork(boolean resultatHomeWork){
        this.resultatHomeWork = resultatHomeWork;
    }
    public boolean  isReponseEtudiantHomeWorks(){
        return this.reponseEtudiantHomeWorks ;
    }
    public void  setReponseEtudiantHomeWorks(boolean reponseEtudiantHomeWorks ){
        this.reponseEtudiantHomeWorks  = reponseEtudiantHomeWorks ;
    }
}
