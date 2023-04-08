package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.RecommendTeacherHistory;
import ma.sir.alc.bean.core.RecommendTeacher;
import ma.sir.alc.ws.dto.RecommendTeacherDto;

@Component
public class RecommendTeacherConverter extends AbstractConverter<RecommendTeacher, RecommendTeacherDto, RecommendTeacherHistory> {

    @Autowired
    private ProfConverter profConverter ;
    private boolean prof;

    public  RecommendTeacherConverter(){
        super(RecommendTeacher.class, RecommendTeacherDto.class, RecommendTeacherHistory.class);
    }

    @Override
    public RecommendTeacher toItem(RecommendTeacherDto dto) {
        if (dto == null) {
            return null;
        } else {
        RecommendTeacher item = new RecommendTeacher();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getRef()))
                item.setRef(dto.getRef());
            if(StringUtil.isNotEmpty(dto.getNombrevote()))
                item.setNombrevote(dto.getNombrevote());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getCommentaire()))
                item.setCommentaire(dto.getCommentaire());
            if(StringUtil.isNotEmpty(dto.getTelephone()))
                item.setTelephone(dto.getTelephone());
            if(StringUtil.isNotEmpty(dto.getLogin()))
                item.setLogin(dto.getLogin());
            if(StringUtil.isNotEmpty(dto.getDateRecommamdation()))
                item.setDateRecommamdation(DateUtil.stringEnToDate(dto.getDateRecommamdation()));
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }



        return item;
        }
    }

    @Override
    public RecommendTeacherDto toDto(RecommendTeacher item) {
        if (item == null) {
            return null;
        } else {
            RecommendTeacherDto dto = new RecommendTeacherDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getRef()))
                dto.setRef(item.getRef());
            if(StringUtil.isNotEmpty(item.getNombrevote()))
                dto.setNombrevote(item.getNombrevote());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getCommentaire()))
                dto.setCommentaire(item.getCommentaire());
            if(StringUtil.isNotEmpty(item.getTelephone()))
                dto.setTelephone(item.getTelephone());
            if(StringUtil.isNotEmpty(item.getLogin()))
                dto.setLogin(item.getLogin());
            if(item.getDateRecommamdation()!=null)
                dto.setDateRecommamdation(DateUtil.dateTimeToString(item.getDateRecommamdation()));
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
    }


    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
}
