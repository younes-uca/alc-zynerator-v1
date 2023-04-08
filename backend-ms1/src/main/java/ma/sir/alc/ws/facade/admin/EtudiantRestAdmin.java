package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Etudiant;
import ma.sir.alc.bean.history.EtudiantHistory;
import ma.sir.alc.dao.criteria.core.EtudiantCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtudiantAdminService;
import ma.sir.alc.ws.converter.EtudiantConverter;
import ma.sir.alc.ws.dto.EtudiantDto;
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

@Api("Manages etudiant services")
@RestController
@RequestMapping("/api/admin/etudiant/")
public class EtudiantRestAdmin  extends AbstractController<Etudiant, EtudiantDto, EtudiantHistory, EtudiantCriteria, EtudiantHistoryCriteria, EtudiantAdminService, EtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiants")
    @GetMapping("")
    public ResponseEntity<List<EtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etudiant")
    @PutMapping("")
    public ResponseEntity<EtudiantDto> update(@RequestBody EtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiant")
    @PostMapping("")
    public ResponseEntity<EtudiantDto> save(@RequestBody EtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<EtudiantDto>> delete(@RequestBody List<EtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiant")
    @DeleteMapping("")
    public ResponseEntity<EtudiantDto> delete(@RequestBody EtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by teacherLocality id")
    @GetMapping("teacherLocality/id/{id}")
    public List<Etudiant> findByTeacherLocalityId(@PathVariable Long id){
        return service.findByTeacherLocalityId(id);
    }
    @ApiOperation("delete by teacherLocality id")
    @DeleteMapping("teacherLocality/id/{id}")
    public int deleteByTeacherLocalityId(@PathVariable Long id){
        return service.deleteByTeacherLocalityId(id);
    }
    @ApiOperation("find by etatEtudiantSchedule id")
    @GetMapping("etatEtudiantSchedule/id/{id}")
    public List<Etudiant> findByEtatEtudiantScheduleId(@PathVariable Long id){
        return service.findByEtatEtudiantScheduleId(id);
    }
    @ApiOperation("delete by etatEtudiantSchedule id")
    @DeleteMapping("etatEtudiantSchedule/id/{id}")
    public int deleteByEtatEtudiantScheduleId(@PathVariable Long id){
        return service.deleteByEtatEtudiantScheduleId(id);
    }
    @ApiOperation("find by parcours id")
    @GetMapping("parcours/id/{id}")
    public List<Etudiant> findByParcoursId(@PathVariable Long id){
        return service.findByParcoursId(id);
    }
    @ApiOperation("delete by parcours id")
    @DeleteMapping("parcours/id/{id}")
    public int deleteByParcoursId(@PathVariable Long id){
        return service.deleteByParcoursId(id);
    }
    @ApiOperation("find by groupeEtude id")
    @GetMapping("groupeEtude/id/{id}")
    public List<Etudiant> findByGroupeEtudeId(@PathVariable Long id){
        return service.findByGroupeEtudeId(id);
    }
    @ApiOperation("delete by groupeEtude id")
    @DeleteMapping("groupeEtude/id/{id}")
    public int deleteByGroupeEtudeId(@PathVariable Long id){
        return service.deleteByGroupeEtudeId(id);
    }
    @ApiOperation("find by packStudent id")
    @GetMapping("packStudent/id/{id}")
    public List<Etudiant> findByPackStudentId(@PathVariable Long id){
        return service.findByPackStudentId(id);
    }
    @ApiOperation("delete by packStudent id")
    @DeleteMapping("packStudent/id/{id}")
    public int deleteByPackStudentId(@PathVariable Long id){
        return service.deleteByPackStudentId(id);
    }
    @ApiOperation("find by statutSocial id")
    @GetMapping("statutSocial/id/{id}")
    public List<Etudiant> findByStatutSocialId(@PathVariable Long id){
        return service.findByStatutSocialId(id);
    }
    @ApiOperation("delete by statutSocial id")
    @DeleteMapping("statutSocial/id/{id}")
    public int deleteByStatutSocialId(@PathVariable Long id){
        return service.deleteByStatutSocialId(id);
    }
    @ApiOperation("find by interetEtudiant id")
    @GetMapping("interetEtudiant/id/{id}")
    public List<Etudiant> findByInteretEtudiantId(@PathVariable Long id){
        return service.findByInteretEtudiantId(id);
    }
    @ApiOperation("delete by interetEtudiant id")
    @DeleteMapping("interetEtudiant/id/{id}")
    public int deleteByInteretEtudiantId(@PathVariable Long id){
        return service.deleteByInteretEtudiantId(id);
    }
    @ApiOperation("find by niveauEtude id")
    @GetMapping("niveauEtude/id/{id}")
    public List<Etudiant> findByNiveauEtudeId(@PathVariable Long id){
        return service.findByNiveauEtudeId(id);
    }
    @ApiOperation("delete by niveauEtude id")
    @DeleteMapping("niveauEtude/id/{id}")
    public int deleteByNiveauEtudeId(@PathVariable Long id){
        return service.deleteByNiveauEtudeId(id);
    }
    @ApiOperation("find by skill id")
    @GetMapping("skill/id/{id}")
    public List<Etudiant> findBySkillId(@PathVariable Long id){
        return service.findBySkillId(id);
    }
    @ApiOperation("delete by skill id")
    @DeleteMapping("skill/id/{id}")
    public int deleteBySkillId(@PathVariable Long id){
        return service.deleteBySkillId(id);
    }
    @ApiOperation("find by fonction id")
    @GetMapping("fonction/id/{id}")
    public List<Etudiant> findByFonctionId(@PathVariable Long id){
        return service.findByFonctionId(id);
    }
    @ApiOperation("delete by fonction id")
    @DeleteMapping("fonction/id/{id}")
    public int deleteByFonctionId(@PathVariable Long id){
        return service.deleteByFonctionId(id);
    }
    @ApiOperation("find by langue id")
    @GetMapping("langue/id/{id}")
    public List<Etudiant> findByLangueId(@PathVariable Long id){
        return service.findByLangueId(id);
    }
    @ApiOperation("delete by langue id")
    @DeleteMapping("langue/id/{id}")
    public int deleteByLangueId(@PathVariable Long id){
        return service.deleteByLangueId(id);
    }
    @ApiOperation("Finds a etudiant and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<EtudiantDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds etudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtudiantDto>> findByCriteria(@RequestBody EtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantRestAdmin (EtudiantAdminService service, EtudiantConverter converter) {
        super(service, converter);
    }


}