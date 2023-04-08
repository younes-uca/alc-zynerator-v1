package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.TrancheHoraireProf;
import ma.sir.alc.bean.history.TrancheHoraireProfHistory;
import ma.sir.alc.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.sir.alc.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.sir.alc.service.facade.admin.TrancheHoraireProfAdminService;
import ma.sir.alc.ws.converter.TrancheHoraireProfConverter;
import ma.sir.alc.ws.dto.TrancheHoraireProfDto;
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

@Api("Manages trancheHoraireProf services")
@RestController
@RequestMapping("/api/admin/trancheHoraireProf/")
public class TrancheHoraireProfRestAdmin  extends AbstractController<TrancheHoraireProf, TrancheHoraireProfDto, TrancheHoraireProfHistory, TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria, TrancheHoraireProfAdminService, TrancheHoraireProfConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all trancheHoraireProfs")
    @GetMapping("")
    public ResponseEntity<List<TrancheHoraireProfDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  trancheHoraireProf")
    @PutMapping("")
    public ResponseEntity<TrancheHoraireProfDto> update(@RequestBody TrancheHoraireProfDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a trancheHoraireProf by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TrancheHoraireProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  trancheHoraireProf")
    @PostMapping("")
    public ResponseEntity<TrancheHoraireProfDto> save(@RequestBody TrancheHoraireProfDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of trancheHoraireProf")
    @PostMapping("multiple")
    public ResponseEntity<List<TrancheHoraireProfDto>> delete(@RequestBody List<TrancheHoraireProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified trancheHoraireProf")
    @DeleteMapping("")
    public ResponseEntity<TrancheHoraireProfDto> delete(@RequestBody TrancheHoraireProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified trancheHoraireProf")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple trancheHoraireProfs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<TrancheHoraireProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds trancheHoraireProfs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TrancheHoraireProfDto>> findByCriteria(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated trancheHoraireProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports trancheHoraireProfs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TrancheHoraireProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets trancheHoraireProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports trancheHoraireProf history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets trancheHoraireProf history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TrancheHoraireProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TrancheHoraireProfRestAdmin (TrancheHoraireProfAdminService service, TrancheHoraireProfConverter converter) {
        super(service, converter);
    }


}