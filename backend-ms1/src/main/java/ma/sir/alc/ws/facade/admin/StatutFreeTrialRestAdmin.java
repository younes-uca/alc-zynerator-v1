package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.StatutFreeTrial;
import ma.sir.alc.bean.history.StatutFreeTrialHistory;
import ma.sir.alc.dao.criteria.core.StatutFreeTrialCriteria;
import ma.sir.alc.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.sir.alc.service.facade.admin.StatutFreeTrialAdminService;
import ma.sir.alc.ws.converter.StatutFreeTrialConverter;
import ma.sir.alc.ws.dto.StatutFreeTrialDto;
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

@Api("Manages statutFreeTrial services")
@RestController
@RequestMapping("/api/admin/statutFreeTrial/")
public class StatutFreeTrialRestAdmin  extends AbstractController<StatutFreeTrial, StatutFreeTrialDto, StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialAdminService, StatutFreeTrialConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all statutFreeTrials")
    @GetMapping("")
    public ResponseEntity<List<StatutFreeTrialDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  statutFreeTrial")
    @PutMapping("")
    public ResponseEntity<StatutFreeTrialDto> update(@RequestBody StatutFreeTrialDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a statutFreeTrial by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StatutFreeTrialDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  statutFreeTrial")
    @PostMapping("")
    public ResponseEntity<StatutFreeTrialDto> save(@RequestBody StatutFreeTrialDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of statutFreeTrial")
    @PostMapping("multiple")
    public ResponseEntity<List<StatutFreeTrialDto>> delete(@RequestBody List<StatutFreeTrialDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified statutFreeTrial")
    @DeleteMapping("")
    public ResponseEntity<StatutFreeTrialDto> delete(@RequestBody StatutFreeTrialDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified statutFreeTrial")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple statutFreeTrials by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds statutFreeTrials by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<StatutFreeTrialDto>> findByCriteria(@RequestBody StatutFreeTrialCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated statutFreeTrials by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatutFreeTrialCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutFreeTrials by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody StatutFreeTrialCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets statutFreeTrial data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StatutFreeTrialCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets statutFreeTrial history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets statutFreeTrial paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatutFreeTrialHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutFreeTrial history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatutFreeTrialHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets statutFreeTrial history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatutFreeTrialHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StatutFreeTrialRestAdmin (StatutFreeTrialAdminService service, StatutFreeTrialConverter converter) {
        super(service, converter);
    }


}