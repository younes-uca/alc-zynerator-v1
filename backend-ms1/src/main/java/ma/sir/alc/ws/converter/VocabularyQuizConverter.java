package  ma.sir.alc.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.alc.zynerator.util.ListUtil;

import ma.sir.alc.bean.core.Section;

import ma.sir.alc.zynerator.util.StringUtil;
import ma.sir.alc.zynerator.converter.AbstractConverter;
import ma.sir.alc.zynerator.util.DateUtil;
import ma.sir.alc.bean.history.VocabularyQuizHistory;
import ma.sir.alc.bean.core.VocabularyQuiz;
import ma.sir.alc.ws.dto.VocabularyQuizDto;

@Component
public class VocabularyQuizConverter extends AbstractConverter<VocabularyQuiz, VocabularyQuizDto, VocabularyQuizHistory> {

    @Autowired
    private VocabularyConverter vocabularyConverter ;
    @Autowired
    private SectionConverter sectionConverter ;
    private boolean section;
    private boolean vocabularys;

    public  VocabularyQuizConverter(){
        super(VocabularyQuiz.class, VocabularyQuizDto.class, VocabularyQuizHistory.class);
        init(true);
    }

    @Override
    public VocabularyQuiz toItem(VocabularyQuizDto dto) {
        if (dto == null) {
            return null;
        } else {
        VocabularyQuiz item = new VocabularyQuiz();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateDebut()))
                item.setDateDebut(DateUtil.stringEnToDate(dto.getDateDebut()));
            if(StringUtil.isNotEmpty(dto.getDateFin()))
                item.setDateFin(DateUtil.stringEnToDate(dto.getDateFin()));
            if(dto.getSection() != null && dto.getSection().getId() != null){
                item.setSection(new Section());
                item.getSection().setId(dto.getSection().getId());
            }


            if(this.vocabularys && ListUtil.isNotEmpty(dto.getVocabularys()))
                item.setVocabularys(vocabularyConverter.toItem(dto.getVocabularys()));

        return item;
        }
    }

    @Override
    public VocabularyQuizDto toDto(VocabularyQuiz item) {
        if (item == null) {
            return null;
        } else {
            VocabularyQuizDto dto = new VocabularyQuizDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getDateDebut()!=null)
                dto.setDateDebut(DateUtil.dateTimeToString(item.getDateDebut()));
            if(item.getDateFin()!=null)
                dto.setDateFin(DateUtil.dateTimeToString(item.getDateFin()));
        if(this.section && item.getSection()!=null) {
            dto.setSection(sectionConverter.toDto(item.getSection())) ;
        }
        if(this.vocabularys && ListUtil.isNotEmpty(item.getVocabularys())){
            vocabularyConverter.init(true);
            vocabularyConverter.setVocabularyQuiz(false);
            dto.setVocabularys(vocabularyConverter.toDto(item.getVocabularys()));
            vocabularyConverter.setVocabularyQuiz(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.vocabularys = value;
    }

    public void initObject(boolean value) {
        this.section = value;
    }


    public VocabularyConverter getVocabularyConverter(){
        return this.vocabularyConverter;
    }
    public void setVocabularyConverter(VocabularyConverter vocabularyConverter ){
        this.vocabularyConverter = vocabularyConverter;
    }
    public SectionConverter getSectionConverter(){
        return this.sectionConverter;
    }
    public void setSectionConverter(SectionConverter sectionConverter ){
        this.sectionConverter = sectionConverter;
    }
    public boolean  isSection(){
        return this.section;
    }
    public void  setSection(boolean section){
        this.section = section;
    }
    public boolean  isVocabularys(){
        return this.vocabularys ;
    }
    public void  setVocabularys(boolean vocabularys ){
        this.vocabularys  = vocabularys ;
    }
}
