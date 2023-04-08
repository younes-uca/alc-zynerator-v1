package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ReclamationEtudiant;
import ma.sir.alc.bean.history.ReclamationEtudiantHistory;
import ma.sir.alc.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.ReclamationEtudiantAdminService;
import ma.sir.alc.ws.converter.ReclamationEtudiantConverter;
import ma.sir.alc.ws.dto.ReclamationEtudiantDto;
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

@Api("Manages reclamationEtudiant services")
@RestController
@RequestMapping("/api/admin/reclamationEtudiant/")
public class ReclamationEtudiantRestAdmin  extends AbstractController<ReclamationEtudiant, ReclamationEtudiantDto, ReclamationEtudiantHistory, ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria, ReclamationEtudiantAdminService, ReclamationEtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reclamationEtudiants")
    @GetMapping("")
    public ResponseEntity<List<ReclamationEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  reclamationEtudiant")
    @PutMapping("")
    public ResponseEntity<ReclamationEtudiantDto> update(@RequestBody ReclamationEtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a reclamationEtudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReclamationEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reclamationEtudiant")
    @PostMapping("")
    public ResponseEntity<ReclamationEtudiantDto> save(@RequestBody ReclamationEtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of reclamationEtudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<ReclamationEtudiantDto>> delete(@RequestBody List<ReclamationEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reclamationEtudiant")
    @DeleteMapping("")
    public ResponseEntity<ReclamationEtudiantDto> delete(@RequestBody ReclamationEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reclamationEtudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reclamationEtudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by typeReclamationEtudiant id")
    @GetMapping("typeReclamationEtudiant/id/{id}")
    public List<ReclamationEtudiant> findByTypeReclamationEtudiantId(@PathVariable Long id){
        return service.findByTypeReclamationEtudiantId(id);
    }
    @ApiOperation("delete by typeReclamationEtudiant id")
    @DeleteMapping("typeReclamationEtudiant/id/{id}")
    public int deleteByTypeReclamationEtudiantId(@PathVariable Long id){
        return service.deleteByTypeReclamationEtudiantId(id);
    }
    @ApiOperation("Finds reclamationEtudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReclamationEtudiantDto>> findByCriteria(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reclamationEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationEtudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReclamationEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reclamationEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reclamationEtudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reclamationEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReclamationEtudiantRestAdmin (ReclamationEtudiantAdminService service, ReclamationEtudiantConverter converter) {
        super(service, converter);
    }


}