package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.GroupeEtudiant;
import ma.sir.alc.bean.history.GroupeEtudiantHistory;
import ma.sir.alc.dao.criteria.core.GroupeEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.GroupeEtudiantAdminService;
import ma.sir.alc.ws.converter.GroupeEtudiantConverter;
import ma.sir.alc.ws.dto.GroupeEtudiantDto;
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

@Api("Manages groupeEtudiant services")
@RestController
@RequestMapping("/api/admin/groupeEtudiant/")
public class GroupeEtudiantRestAdmin  extends AbstractController<GroupeEtudiant, GroupeEtudiantDto, GroupeEtudiantHistory, GroupeEtudiantCriteria, GroupeEtudiantHistoryCriteria, GroupeEtudiantAdminService, GroupeEtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all groupeEtudiants")
    @GetMapping("")
    public ResponseEntity<List<GroupeEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  groupeEtudiant")
    @PutMapping("")
    public ResponseEntity<GroupeEtudiantDto> update(@RequestBody GroupeEtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a groupeEtudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<GroupeEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  groupeEtudiant")
    @PostMapping("")
    public ResponseEntity<GroupeEtudiantDto> save(@RequestBody GroupeEtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of groupeEtudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<GroupeEtudiantDto>> delete(@RequestBody List<GroupeEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified groupeEtudiant")
    @DeleteMapping("")
    public ResponseEntity<GroupeEtudiantDto> delete(@RequestBody GroupeEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified groupeEtudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple groupeEtudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by groupeEtude id")
    @GetMapping("groupeEtude/id/{id}")
    public List<GroupeEtudiant> findByGroupeEtudeId(@PathVariable Long id){
        return service.findByGroupeEtudeId(id);
    }
    @ApiOperation("delete by groupeEtude id")
    @DeleteMapping("groupeEtude/id/{id}")
    public int deleteByGroupeEtudeId(@PathVariable Long id){
        return service.deleteByGroupeEtudeId(id);
    }
    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public List<GroupeEtudiant> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<GroupeEtudiant> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds a groupeEtudiant and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<GroupeEtudiantDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds groupeEtudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<GroupeEtudiantDto>> findByCriteria(@RequestBody GroupeEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated groupeEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GroupeEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody GroupeEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets groupeEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody GroupeEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets groupeEtudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets groupeEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody GroupeEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody GroupeEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets groupeEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody GroupeEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public GroupeEtudiantRestAdmin (GroupeEtudiantAdminService service, GroupeEtudiantConverter converter) {
        super(service, converter);
    }


}