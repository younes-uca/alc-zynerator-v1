package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.SessionCours;
import ma.sir.alc.bean.history.SessionCoursHistory;
import ma.sir.alc.dao.criteria.core.SessionCoursCriteria;
import ma.sir.alc.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.sir.alc.service.facade.admin.SessionCoursAdminService;
import ma.sir.alc.ws.converter.SessionCoursConverter;
import ma.sir.alc.ws.dto.SessionCoursDto;
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

@Api("Manages sessionCours services")
@RestController
@RequestMapping("/api/admin/sessionCours/")
public class SessionCoursRestAdmin  extends AbstractController<SessionCours, SessionCoursDto, SessionCoursHistory, SessionCoursCriteria, SessionCoursHistoryCriteria, SessionCoursAdminService, SessionCoursConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all sessionCourss")
    @GetMapping("")
    public ResponseEntity<List<SessionCoursDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  sessionCours")
    @PutMapping("")
    public ResponseEntity<SessionCoursDto> update(@RequestBody SessionCoursDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a sessionCours by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SessionCoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  sessionCours")
    @PostMapping("")
    public ResponseEntity<SessionCoursDto> save(@RequestBody SessionCoursDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of sessionCours")
    @PostMapping("multiple")
    public ResponseEntity<List<SessionCoursDto>> delete(@RequestBody List<SessionCoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified sessionCours")
    @DeleteMapping("")
    public ResponseEntity<SessionCoursDto> delete(@RequestBody SessionCoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified sessionCours")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple sessionCourss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<SessionCours> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<SessionCours> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("find by groupeEtudiant id")
    @GetMapping("groupeEtudiant/id/{id}")
    public List<SessionCours> findByGroupeEtudiantId(@PathVariable Long id){
        return service.findByGroupeEtudiantId(id);
    }
    @ApiOperation("delete by groupeEtudiant id")
    @DeleteMapping("groupeEtudiant/id/{id}")
    public int deleteByGroupeEtudiantId(@PathVariable Long id){
        return service.deleteByGroupeEtudiantId(id);
    }
    @ApiOperation("find by salary id")
    @GetMapping("salary/id/{id}")
    public List<SessionCours> findBySalaryId(@PathVariable Long id){
        return service.findBySalaryId(id);
    }
    @ApiOperation("delete by salary id")
    @DeleteMapping("salary/id/{id}")
    public int deleteBySalaryId(@PathVariable Long id){
        return service.deleteBySalaryId(id);
    }
    @ApiOperation("Finds a sessionCours and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<SessionCoursDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds sessionCourss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SessionCoursDto>> findByCriteria(@RequestBody SessionCoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated sessionCourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SessionCoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sessionCourss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SessionCoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets sessionCours data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SessionCoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets sessionCours history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets sessionCours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SessionCoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sessionCours history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SessionCoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets sessionCours history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SessionCoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SessionCoursRestAdmin (SessionCoursAdminService service, SessionCoursConverter converter) {
        super(service, converter);
    }


}