package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtatEtudiant;
import ma.sir.alc.bean.history.EtatEtudiantHistory;
import ma.sir.alc.dao.criteria.core.EtatEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtatEtudiantAdminService;
import ma.sir.alc.ws.converter.EtatEtudiantConverter;
import ma.sir.alc.ws.dto.EtatEtudiantDto;
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

@Api("Manages etatEtudiant services")
@RestController
@RequestMapping("/api/admin/etatEtudiant/")
public class EtatEtudiantRestAdmin  extends AbstractController<EtatEtudiant, EtatEtudiantDto, EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantAdminService, EtatEtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatEtudiants")
    @GetMapping("")
    public ResponseEntity<List<EtatEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etatEtudiant")
    @PutMapping("")
    public ResponseEntity<EtatEtudiantDto> update(@RequestBody EtatEtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etatEtudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatEtudiant")
    @PostMapping("")
    public ResponseEntity<EtatEtudiantDto> save(@RequestBody EtatEtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etatEtudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatEtudiantDto>> delete(@RequestBody List<EtatEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatEtudiant")
    @DeleteMapping("")
    public ResponseEntity<EtatEtudiantDto> delete(@RequestBody EtatEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatEtudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatEtudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds etatEtudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatEtudiantDto>> findByCriteria(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatEtudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatEtudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatEtudiantRestAdmin (EtatEtudiantAdminService service, EtatEtudiantConverter converter) {
        super(service, converter);
    }


}