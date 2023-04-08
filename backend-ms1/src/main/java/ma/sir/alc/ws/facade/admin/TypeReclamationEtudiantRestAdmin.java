package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.TypeReclamationEtudiant;
import ma.sir.alc.bean.history.TypeReclamationEtudiantHistory;
import ma.sir.alc.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.sir.alc.ws.converter.TypeReclamationEtudiantConverter;
import ma.sir.alc.ws.dto.TypeReclamationEtudiantDto;
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

@Api("Manages typeReclamationEtudiant services")
@RestController
@RequestMapping("/api/admin/typeReclamationEtudiant/")
public class TypeReclamationEtudiantRestAdmin  extends AbstractController<TypeReclamationEtudiant, TypeReclamationEtudiantDto, TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantAdminService, TypeReclamationEtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeReclamationEtudiants")
    @GetMapping("")
    public ResponseEntity<List<TypeReclamationEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeReclamationEtudiant")
    @PutMapping("")
    public ResponseEntity<TypeReclamationEtudiantDto> update(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeReclamationEtudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeReclamationEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeReclamationEtudiant")
    @PostMapping("")
    public ResponseEntity<TypeReclamationEtudiantDto> save(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeReclamationEtudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeReclamationEtudiantDto>> delete(@RequestBody List<TypeReclamationEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeReclamationEtudiant")
    @DeleteMapping("")
    public ResponseEntity<TypeReclamationEtudiantDto> delete(@RequestBody TypeReclamationEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeReclamationEtudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeReclamationEtudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds typeReclamationEtudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeReclamationEtudiantDto>> findByCriteria(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeReclamationEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationEtudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeReclamationEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeReclamationEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeReclamationEtudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeReclamationEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeReclamationEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeReclamationEtudiantRestAdmin (TypeReclamationEtudiantAdminService service, TypeReclamationEtudiantConverter converter) {
        super(service, converter);
    }


}