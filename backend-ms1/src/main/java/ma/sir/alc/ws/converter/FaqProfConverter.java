package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.FaqProfHistory;
import ma.sir.alc.bean.core.FaqProf;
import ma.sir.alc.ws.dto.FaqProfDto;

@Component
public class FaqProfConverter extends AbstractConverter<FaqProf, FaqProfDto, FaqProfHistory> {

    @Autowired
    private AdminConverter adminConverter ;
    @Autowired
    private ProfConverter profConverter ;
    @Autowired
    private FaqTypeConverter faqTypeConverter ;
    private boolean prof;
    private boolean admin;
    private boolean faqType;

    public  FaqProfConverter(){
        super(FaqProf.class, FaqProfDto.class, FaqProfHistory.class);
    }

    @Override
    public FaqProf toItem(FaqProfDto dto) {
        if (dto == null) {
            return null;
        } else {
        FaqProf item = new FaqProf();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }

            if(this.admin && dto.getAdmin()!=null)
                item.setAdmin(adminConverter.toItem(dto.getAdmin())) ;

            if(this.faqType && dto.getFaqType()!=null)
                item.setFaqType(faqTypeConverter.toItem(dto.getFaqType())) ;



        return item;
        }
    }

    @Override
    public FaqProfDto toDto(FaqProf item) {
        if (item == null) {
            return null;
        } else {
            FaqProfDto dto = new FaqProfDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
        if(this.prof && item.getProf()!=null) {
            dto.setProf(profConverter.toDto(item.getProf())) ;
        }
        if(this.admin && item.getAdmin()!=null) {
            dto.setAdmin(adminConverter.toDto(item.getAdmin())) ;
        }
        if(this.faqType && item.getFaqType()!=null) {
            dto.setFaqType(faqTypeConverter.toDto(item.getFaqType())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.prof = value;
        this.admin = value;
        this.faqType = value;
    }


    public AdminConverter getAdminConverter(){
        return this.adminConverter;
    }
    public void setAdminConverter(AdminConverter adminConverter ){
        this.adminConverter = adminConverter;
    }
    public ProfConverter getProfConverter(){
        return this.profConverter;
    }
    public void setProfConverter(ProfConverter profConverter ){
        this.profConverter = profConverter;
    }
    public FaqTypeConverter getFaqTypeConverter(){
        return this.faqTypeConverter;
    }
    public void setFaqTypeConverter(FaqTypeConverter faqTypeConverter ){
        this.faqTypeConverter = faqTypeConverter;
    }
    public boolean  isProf(){
        return this.prof;
    }
    public void  setProf(boolean prof){
        this.prof = prof;
    }
    public boolean  isAdmin(){
        return this.admin;
    }
    public void  setAdmin(boolean admin){
        this.admin = admin;
    }
    public boolean  isFaqType(){
        return this.faqType;
    }
    public void  setFaqType(boolean faqType){
        this.faqType = faqType;
    }
}
