package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.FreeTrialStudentEmailTemplate;
import ma.sir.alc.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.sir.alc.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.sir.alc.ws.converter.FreeTrialStudentEmailTemplateConverter;
import ma.sir.alc.ws.dto.FreeTrialStudentEmailTemplateDto;
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

@Api("Manages freeTrialStudentEmailTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialStudentEmailTemplate/")
public class FreeTrialStudentEmailTemplateRestAdmin  extends AbstractController<FreeTrialStudentEmailTemplate, FreeTrialStudentEmailTemplateDto, FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateAdminService, FreeTrialStudentEmailTemplateConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialStudentEmailTemplates")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialStudentEmailTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  freeTrialStudentEmailTemplate")
    @PutMapping("")
    public ResponseEntity<FreeTrialStudentEmailTemplateDto> update(@RequestBody FreeTrialStudentEmailTemplateDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a freeTrialStudentEmailTemplate by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialStudentEmailTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialStudentEmailTemplate")
    @PostMapping("")
    public ResponseEntity<FreeTrialStudentEmailTemplateDto> save(@RequestBody FreeTrialStudentEmailTemplateDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of freeTrialStudentEmailTemplate")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialStudentEmailTemplateDto>> delete(@RequestBody List<FreeTrialStudentEmailTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialStudentEmailTemplate")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialStudentEmailTemplateDto> delete(@RequestBody FreeTrialStudentEmailTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialStudentEmailTemplate")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialStudentEmailTemplates by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds freeTrialStudentEmailTemplates by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialStudentEmailTemplateDto>> findByCriteria(@RequestBody FreeTrialStudentEmailTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialStudentEmailTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialStudentEmailTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentEmailTemplates by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialStudentEmailTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialStudentEmailTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialStudentEmailTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialStudentEmailTemplate history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialStudentEmailTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialStudentEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialStudentEmailTemplate history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialStudentEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialStudentEmailTemplate history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialStudentEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialStudentEmailTemplateRestAdmin (FreeTrialStudentEmailTemplateAdminService service, FreeTrialStudentEmailTemplateConverter converter) {
        super(service, converter);
    }


}