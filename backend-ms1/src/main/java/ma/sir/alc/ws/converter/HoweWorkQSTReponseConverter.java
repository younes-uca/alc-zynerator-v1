package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.HomeWorkQuestion;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.HoweWorkQSTReponseHistory;
import ma.sir.alc.bean.core.HoweWorkQSTReponse;
import ma.sir.alc.ws.dto.HoweWorkQSTReponseDto;

@Component
public class HoweWorkQSTReponseConverter extends AbstractConverter<HoweWorkQSTReponse, HoweWorkQSTReponseDto, HoweWorkQSTReponseHistory> {

    @Autowired
    private HomeWorkQuestionConverter homeWorkQuestionConverter ;
    @Autowired
    private EtatReponseConverter etatReponseConverter ;
    private boolean etatReponse;
    private boolean homeWorkQuestion;

    public  HoweWorkQSTReponseConverter(){
        super(HoweWorkQSTReponse.class, HoweWorkQSTReponseDto.class, HoweWorkQSTReponseHistory.class);
    }

    @Override
    public HoweWorkQSTReponse toItem(HoweWorkQSTReponseDto dto) {
        if (dto == null) {
            return null;
        } else {
        HoweWorkQSTReponse item = new HoweWorkQSTReponse();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getLib()))
                item.setLib(dto.getLib());
            if(StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if(this.etatReponse && dto.getEtatReponse()!=null)
                item.setEtatReponse(etatReponseConverter.toItem(dto.getEtatReponse())) ;

            if(dto.getHomeWorkQuestion() != null && dto.getHomeWorkQuestion().getId() != null){
                item.setHomeWorkQuestion(new HomeWorkQuestion());
                item.getHomeWorkQuestion().setId(dto.getHomeWorkQuestion().getId());
            }



        return item;
        }
    }

    @Override
    public HoweWorkQSTReponseDto toDto(HoweWorkQSTReponse item) {
        if (item == null) {
            return null;
        } else {
            HoweWorkQSTReponseDto dto = new HoweWorkQSTReponseDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getLib()))
                dto.setLib(item.getLib());
            if(StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
        if(this.etatReponse && item.getEtatReponse()!=null) {
            dto.setEtatReponse(etatReponseConverter.toDto(item.getEtatReponse())) ;
        }
        if(this.homeWorkQuestion && item.getHomeWorkQuestion()!=null) {
            dto.setHomeWorkQuestion(homeWorkQuestionConverter.toDto(item.getHomeWorkQuestion())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.etatReponse = value;
        this.homeWorkQuestion = value;
    }


    public HomeWorkQuestionConverter getHomeWorkQuestionConverter(){
        return this.homeWorkQuestionConverter;
    }
    public void setHomeWorkQuestionConverter(HomeWorkQuestionConverter homeWorkQuestionConverter ){
        this.homeWorkQuestionConverter = homeWorkQuestionConverter;
    }
    public EtatReponseConverter getEtatReponseConverter(){
        return this.etatReponseConverter;
    }
    public void setEtatReponseConverter(EtatReponseConverter etatReponseConverter ){
        this.etatReponseConverter = etatReponseConverter;
    }
    public boolean  isEtatReponse(){
        return this.etatReponse;
    }
    public void  setEtatReponse(boolean etatReponse){
        this.etatReponse = etatReponse;
    }
    public boolean  isHomeWorkQuestion(){
        return this.homeWorkQuestion;
    }
    public void  setHomeWorkQuestion(boolean homeWorkQuestion){
        this.homeWorkQuestion = homeWorkQuestion;
    }
}
