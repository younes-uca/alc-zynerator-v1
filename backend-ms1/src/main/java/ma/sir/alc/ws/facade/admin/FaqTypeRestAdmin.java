package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.FaqType;
import ma.sir.alc.bean.history.FaqTypeHistory;
import ma.sir.alc.dao.criteria.core.FaqTypeCriteria;
import ma.sir.alc.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.sir.alc.service.facade.admin.FaqTypeAdminService;
import ma.sir.alc.ws.converter.FaqTypeConverter;
import ma.sir.alc.ws.dto.FaqTypeDto;
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

@Api("Manages faqType services")
@RestController
@RequestMapping("/api/admin/faqType/")
public class FaqTypeRestAdmin  extends AbstractController<FaqType, FaqTypeDto, FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeAdminService, FaqTypeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all faqTypes")
    @GetMapping("")
    public ResponseEntity<List<FaqTypeDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  faqType")
    @PutMapping("")
    public ResponseEntity<FaqTypeDto> update(@RequestBody FaqTypeDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a faqType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FaqTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  faqType")
    @PostMapping("")
    public ResponseEntity<FaqTypeDto> save(@RequestBody FaqTypeDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of faqType")
    @PostMapping("multiple")
    public ResponseEntity<List<FaqTypeDto>> delete(@RequestBody List<FaqTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified faqType")
    @DeleteMapping("")
    public ResponseEntity<FaqTypeDto> delete(@RequestBody FaqTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified faqType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple faqTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds faqTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FaqTypeDto>> findByCriteria(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated faqTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets faqType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FaqTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets faqType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets faqType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports faqType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets faqType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FaqTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FaqTypeRestAdmin (FaqTypeAdminService service, FaqTypeConverter converter) {
        super(service, converter);
    }


}