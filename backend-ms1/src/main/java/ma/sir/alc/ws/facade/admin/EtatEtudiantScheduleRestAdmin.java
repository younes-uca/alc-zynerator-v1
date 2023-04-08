package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtatEtudiantSchedule;
import ma.sir.alc.bean.history.EtatEtudiantScheduleHistory;
import ma.sir.alc.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.sir.alc.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.sir.alc.ws.converter.EtatEtudiantScheduleConverter;
import ma.sir.alc.ws.dto.EtatEtudiantScheduleDto;
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

@Api("Manages etatEtudiantSchedule services")
@RestController
@RequestMapping("/api/admin/etatEtudiantSchedule/")
public class EtatEtudiantScheduleRestAdmin  extends AbstractController<EtatEtudiantSchedule, EtatEtudiantScheduleDto, EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleAdminService, EtatEtudiantScheduleConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatEtudiantSchedules")
    @GetMapping("")
    public ResponseEntity<List<EtatEtudiantScheduleDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etatEtudiantSchedule")
    @PutMapping("")
    public ResponseEntity<EtatEtudiantScheduleDto> update(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etatEtudiantSchedule by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatEtudiantScheduleDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatEtudiantSchedule")
    @PostMapping("")
    public ResponseEntity<EtatEtudiantScheduleDto> save(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etatEtudiantSchedule")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatEtudiantScheduleDto>> delete(@RequestBody List<EtatEtudiantScheduleDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatEtudiantSchedule")
    @DeleteMapping("")
    public ResponseEntity<EtatEtudiantScheduleDto> delete(@RequestBody EtatEtudiantScheduleDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatEtudiantSchedule")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatEtudiantSchedules by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds etatEtudiantSchedules by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatEtudiantScheduleDto>> findByCriteria(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatEtudiantSchedules by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiantSchedules by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatEtudiantScheduleCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatEtudiantSchedule paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiantSchedule history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatEtudiantSchedule history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatEtudiantScheduleHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatEtudiantScheduleRestAdmin (EtatEtudiantScheduleAdminService service, EtatEtudiantScheduleConverter converter) {
        super(service, converter);
    }


}