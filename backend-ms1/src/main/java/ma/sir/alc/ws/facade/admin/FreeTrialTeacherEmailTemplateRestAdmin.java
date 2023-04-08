package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.FreeTrialTeacherEmailTemplate;
import ma.sir.alc.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.sir.alc.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.sir.alc.ws.converter.FreeTrialTeacherEmailTemplateConverter;
import ma.sir.alc.ws.dto.FreeTrialTeacherEmailTemplateDto;
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

@Api("Manages freeTrialTeacherEmailTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialTeacherEmailTemplate/")
public class FreeTrialTeacherEmailTemplateRestAdmin  extends AbstractController<FreeTrialTeacherEmailTemplate, FreeTrialTeacherEmailTemplateDto, FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateAdminService, FreeTrialTeacherEmailTemplateConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialTeacherEmailTemplates")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  freeTrialTeacherEmailTemplate")
    @PutMapping("")
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> update(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a freeTrialTeacherEmailTemplate by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialTeacherEmailTemplate")
    @PostMapping("")
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> save(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of freeTrialTeacherEmailTemplate")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> delete(@RequestBody List<FreeTrialTeacherEmailTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialTeacherEmailTemplate")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialTeacherEmailTemplateDto> delete(@RequestBody FreeTrialTeacherEmailTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialTeacherEmailTemplate")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialTeacherEmailTemplates by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialTeacherEmailTemplateDto>> findByCriteria(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherEmailTemplates by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialTeacherEmailTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherEmailTemplate history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherEmailTemplate history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialTeacherEmailTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialTeacherEmailTemplateRestAdmin (FreeTrialTeacherEmailTemplateAdminService service, FreeTrialTeacherEmailTemplateConverter converter) {
        super(service, converter);
    }


}