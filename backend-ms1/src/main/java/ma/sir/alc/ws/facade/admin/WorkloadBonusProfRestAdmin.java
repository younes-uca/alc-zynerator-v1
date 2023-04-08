package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.WorkloadBonusProf;
import ma.sir.alc.bean.history.WorkloadBonusProfHistory;
import ma.sir.alc.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.sir.alc.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.sir.alc.service.facade.admin.WorkloadBonusProfAdminService;
import ma.sir.alc.ws.converter.WorkloadBonusProfConverter;
import ma.sir.alc.ws.dto.WorkloadBonusProfDto;
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

@Api("Manages workloadBonusProf services")
@RestController
@RequestMapping("/api/admin/workloadBonusProf/")
public class WorkloadBonusProfRestAdmin  extends AbstractController<WorkloadBonusProf, WorkloadBonusProfDto, WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfAdminService, WorkloadBonusProfConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all workloadBonusProfs")
    @GetMapping("")
    public ResponseEntity<List<WorkloadBonusProfDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  workloadBonusProf")
    @PutMapping("")
    public ResponseEntity<WorkloadBonusProfDto> update(@RequestBody WorkloadBonusProfDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a workloadBonusProf by id")
    @GetMapping("id/{id}")
    public ResponseEntity<WorkloadBonusProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  workloadBonusProf")
    @PostMapping("")
    public ResponseEntity<WorkloadBonusProfDto> save(@RequestBody WorkloadBonusProfDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of workloadBonusProf")
    @PostMapping("multiple")
    public ResponseEntity<List<WorkloadBonusProfDto>> delete(@RequestBody List<WorkloadBonusProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified workloadBonusProf")
    @DeleteMapping("")
    public ResponseEntity<WorkloadBonusProfDto> delete(@RequestBody WorkloadBonusProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified workloadBonusProf")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple workloadBonusProfs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds workloadBonusProfs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<WorkloadBonusProfDto>> findByCriteria(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated workloadBonusProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonusProfs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets workloadBonusProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody WorkloadBonusProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets workloadBonusProf history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets workloadBonusProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports workloadBonusProf history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets workloadBonusProf history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody WorkloadBonusProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public WorkloadBonusProfRestAdmin (WorkloadBonusProfAdminService service, WorkloadBonusProfConverter converter) {
        super(service, converter);
    }


}