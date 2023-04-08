package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Faq;
import ma.sir.alc.bean.history.FaqHistory;
import ma.sir.alc.dao.criteria.core.FaqCriteria;
import ma.sir.alc.dao.criteria.history.FaqHistoryCriteria;
import ma.sir.alc.service.facade.admin.FaqAdminService;
import ma.sir.alc.ws.converter.FaqConverter;
import ma.sir.alc.ws.dto.FaqDto;
import ma.sir.alc.zynerator.controller.AbstractController;
import ma.sir.alc.zynerator.dto.AuditEntityDto;
import ma.sir.alc.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.alc.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.alc.zynerator.dto.FileTempDto;

@Api("Manages faq services")
@RestController
@RequestMapping("/api/admin/faq/")
public class FaqRestAdmin  extends AbstractController<Faq, FaqDto, FaqHistory, FaqCriteria, FaqHistoryCriteria, FaqAdminService, FaqConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all faqs")
    @GetMapping("")
    public ResponseEntity<List<FaqDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  faq")
    @PutMapping("")
    public ResponseEntity<FaqDto> update(@RequestBody FaqDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a faq by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FaqDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  faq")
    @PostMapping("")
    public ResponseEntity<FaqDto> save(@RequestBody FaqDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of faq")
    @PostMapping("multiple")
    public ResponseEntity<List<FaqDto>> delete(@RequestBody List<FaqDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified faq")
    @DeleteMapping("")
    public ResponseEntity<FaqDto> delete(@RequestBody FaqDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified faq")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple faqs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by faqType id")
    @GetMapping("faqType/id/{id}")
    public List<Faq> findByFaqTypeId(@PathVariable Long id){
        return service.findByFaqTypeId(id);
    }
    @ApiOperation("delete by faqType id")
    @DeleteMapping("faqType/id/{id}")
    public int deleteByFaqTypeId(@PathVariable Long id){
        return service.deleteByFaqTypeId(id);
    }
    @ApiOperation("Finds faqs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FaqDto>> findByCriteria(@RequestBody FaqCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated faqs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FaqCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FaqCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets faq data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FaqCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets faq history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets faq paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FaqHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faq history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FaqHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets faq history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FaqHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FaqRestAdmin (FaqAdminService service, FaqConverter converter) {
        super(service, converter);
    }


}