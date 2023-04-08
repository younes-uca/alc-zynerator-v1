package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.CalendrierProf;
import ma.sir.alc.bean.history.CalendrierProfHistory;
import ma.sir.alc.dao.criteria.core.CalendrierProfCriteria;
import ma.sir.alc.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.sir.alc.service.facade.admin.CalendrierProfAdminService;
import ma.sir.alc.ws.converter.CalendrierProfConverter;
import ma.sir.alc.ws.dto.CalendrierProfDto;
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

@Api("Manages calendrierProf services")
@RestController
@RequestMapping("/api/admin/calendrierProf/")
public class CalendrierProfRestAdmin  extends AbstractController<CalendrierProf, CalendrierProfDto, CalendrierProfHistory, CalendrierProfCriteria, CalendrierProfHistoryCriteria, CalendrierProfAdminService, CalendrierProfConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all calendrierProfs")
    @GetMapping("")
    public ResponseEntity<List<CalendrierProfDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  calendrierProf")
    @PutMapping("")
    public ResponseEntity<CalendrierProfDto> update(@RequestBody CalendrierProfDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a calendrierProf by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CalendrierProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  calendrierProf")
    @PostMapping("")
    public ResponseEntity<CalendrierProfDto> save(@RequestBody CalendrierProfDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of calendrierProf")
    @PostMapping("multiple")
    public ResponseEntity<List<CalendrierProfDto>> delete(@RequestBody List<CalendrierProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified calendrierProf")
    @DeleteMapping("")
    public ResponseEntity<CalendrierProfDto> delete(@RequestBody CalendrierProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified calendrierProf")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple calendrierProfs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<CalendrierProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<CalendrierProf> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds calendrierProfs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CalendrierProfDto>> findByCriteria(@RequestBody CalendrierProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated calendrierProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CalendrierProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports calendrierProfs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CalendrierProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets calendrierProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CalendrierProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets calendrierProf history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets calendrierProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CalendrierProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports calendrierProf history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CalendrierProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets calendrierProf history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CalendrierProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CalendrierProfRestAdmin (CalendrierProfAdminService service, CalendrierProfConverter converter) {
        super(service, converter);
    }


}