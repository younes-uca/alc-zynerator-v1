package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.alc.bean.core.Prof;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.SalaryHistory;
import ma.sir.alc.bean.core.Salary;
import ma.sir.alc.ws.dto.SalaryDto;

@Component
public class SalaryConverter extends AbstractConverter<Salary, SalaryDto, SalaryHistory> {

    @Autowired
    private ProfConverter profConverter ;
    private boolean prof;

    public  SalaryConverter(){
        super(Salary.class, SalaryDto.class, SalaryHistory.class);
    }

    @Override
    public Salary toItem(SalaryDto dto) {
        if (dto == null) {
            return null;
        } else {
        Salary item = new Salary();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getAnnee()))
                item.setAnnee(dto.getAnnee());
            if(StringUtil.isNotEmpty(dto.getNbrSessionMensuel()))
                item.setNbrSessionMensuel(dto.getNbrSessionMensuel());
            if(dto.getPayer() != null)
                item.setPayer(dto.getPayer());
            if(StringUtil.isNotEmpty(dto.getTotalPayment()))
                item.setTotalPayment(dto.getTotalPayment());
            if(StringUtil.isNotEmpty(dto.getTotalBonusClassAverage()))
                item.setTotalBonusClassAverage(dto.getTotalBonusClassAverage());
            if(StringUtil.isNotEmpty(dto.getTotalBonusWorkload()))
                item.setTotalBonusWorkload(dto.getTotalBonusWorkload());
            if(dto.getProf() != null && dto.getProf().getId() != null){
                item.setProf(new Prof());
                item.getProf().setId(dto.getProf().getId());
            }



        return item;
        }
    }

    @Override
    public SalaryDto toDto(Salary item) {
        if (item == null) {
            return null;
        } else {
            SalaryDto dto = new SalaryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getAnnee()))
                dto.setAnnee(item.getAnnee());
            if(StringUtil.isNotEmpty(item.getNbrSessionMensuel()))
                dto.setNbrSessionMensuel(item.getNbrSessionMensuel());
                dto.setPayer(item.getPayer());
            if(StringUtil.isNotEmpty(item.getTotalPayment()))
                dto.setTotalPayment(item.getTotalPayment());
            if(StringUtil.isNotEmpty(item.getTotalBonusClassAverage()))
                dto.setTotalBonusClassAverage(item.getTotalBonusClassAverage());
            if(StringUtil.isNotEmpty(item.getTotalBonusWorkload()))
                dto.setTotalBonusWorkload(item.getTotalBonusWorkload());
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
