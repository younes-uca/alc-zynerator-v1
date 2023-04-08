package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.sir.alc.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.sir.alc.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.sir.alc.ws.converter.FreeTrialTeacherWhatsTemplateConverter;
import ma.sir.alc.ws.dto.FreeTrialTeacherWhatsTemplateDto;
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

@Api("Manages freeTrialTeacherWhatsTemplate services")
@RestController
@RequestMapping("/api/admin/freeTrialTeacherWhatsTemplate/")
public class FreeTrialTeacherWhatsTemplateRestAdmin  extends AbstractController<FreeTrialTeacherWhatsTemplate, FreeTrialTeacherWhatsTemplateDto, FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateAdminService, FreeTrialTeacherWhatsTemplateConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialTeacherWhatsTemplates")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  freeTrialTeacherWhatsTemplate")
    @PutMapping("")
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> update(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a freeTrialTeacherWhatsTemplate by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialTeacherWhatsTemplate")
    @PostMapping("")
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> save(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of freeTrialTeacherWhatsTemplate")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> delete(@RequestBody List<FreeTrialTeacherWhatsTemplateDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialTeacherWhatsTemplate")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialTeacherWhatsTemplateDto> delete(@RequestBody FreeTrialTeacherWhatsTemplateDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialTeacherWhatsTemplate")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialTeacherWhatsTemplates by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialTeacherWhatsTemplateDto>> findByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherWhatsTemplates by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialTeacherWhatsTemplateCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialTeacherWhatsTemplate history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialTeacherWhatsTemplate history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialTeacherWhatsTemplateRestAdmin (FreeTrialTeacherWhatsTemplateAdminService service, FreeTrialTeacherWhatsTemplateConverter converter) {
        super(service, converter);
    }


}