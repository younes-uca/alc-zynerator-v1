package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.StatutSocial;
import ma.sir.alc.bean.history.StatutSocialHistory;
import ma.sir.alc.dao.criteria.core.StatutSocialCriteria;
import ma.sir.alc.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.sir.alc.service.facade.admin.StatutSocialAdminService;
import ma.sir.alc.ws.converter.StatutSocialConverter;
import ma.sir.alc.ws.dto.StatutSocialDto;
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

@Api("Manages statutSocial services")
@RestController
@RequestMapping("/api/admin/statutSocial/")
public class StatutSocialRestAdmin  extends AbstractController<StatutSocial, StatutSocialDto, StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialAdminService, StatutSocialConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all statutSocials")
    @GetMapping("")
    public ResponseEntity<List<StatutSocialDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  statutSocial")
    @PutMapping("")
    public ResponseEntity<StatutSocialDto> update(@RequestBody StatutSocialDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a statutSocial by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StatutSocialDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  statutSocial")
    @PostMapping("")
    public ResponseEntity<StatutSocialDto> save(@RequestBody StatutSocialDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of statutSocial")
    @PostMapping("multiple")
    public ResponseEntity<List<StatutSocialDto>> delete(@RequestBody List<StatutSocialDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified statutSocial")
    @DeleteMapping("")
    public ResponseEntity<StatutSocialDto> delete(@RequestBody StatutSocialDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified statutSocial")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple statutSocials by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds statutSocials by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<StatutSocialDto>> findByCriteria(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated statutSocials by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutSocials by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets statutSocial data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StatutSocialCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets statutSocial history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets statutSocial paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutSocial history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets statutSocial history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatutSocialHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StatutSocialRestAdmin (StatutSocialAdminService service, StatutSocialConverter converter) {
        super(service, converter);
    }


}