package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtudiantCours;
import ma.sir.alc.bean.history.EtudiantCoursHistory;
import ma.sir.alc.dao.criteria.core.EtudiantCoursCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtudiantCoursAdminService;
import ma.sir.alc.ws.converter.EtudiantCoursConverter;
import ma.sir.alc.ws.dto.EtudiantCoursDto;
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

@Api("Manages etudiantCours services")
@RestController
@RequestMapping("/api/admin/etudiantCours/")
public class EtudiantCoursRestAdmin  extends AbstractController<EtudiantCours, EtudiantCoursDto, EtudiantCoursHistory, EtudiantCoursCriteria, EtudiantCoursHistoryCriteria, EtudiantCoursAdminService, EtudiantCoursConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiantCourss")
    @GetMapping("")
    public ResponseEntity<List<EtudiantCoursDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etudiantCours")
    @PutMapping("")
    public ResponseEntity<EtudiantCoursDto> update(@RequestBody EtudiantCoursDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etudiantCours by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantCoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiantCours")
    @PostMapping("")
    public ResponseEntity<EtudiantCoursDto> save(@RequestBody EtudiantCoursDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etudiantCours")
    @PostMapping("multiple")
    public ResponseEntity<List<EtudiantCoursDto>> delete(@RequestBody List<EtudiantCoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiantCours")
    @DeleteMapping("")
    public ResponseEntity<EtudiantCoursDto> delete(@RequestBody EtudiantCoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiantCours")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiantCourss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<EtudiantCours> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<EtudiantCours> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<EtudiantCours> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("Finds etudiantCourss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtudiantCoursDto>> findByCriteria(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiantCourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantCourss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiantCours data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantCoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiantCours history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiantCours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantCours history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiantCours history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantCoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantCoursRestAdmin (EtudiantCoursAdminService service, EtudiantCoursConverter converter) {
        super(service, converter);
    }


}