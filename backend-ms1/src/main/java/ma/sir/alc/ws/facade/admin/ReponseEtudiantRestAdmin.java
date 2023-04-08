package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ReponseEtudiant;
import ma.sir.alc.bean.history.ReponseEtudiantHistory;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.sir.alc.service.facade.admin.ReponseEtudiantAdminService;
import ma.sir.alc.ws.converter.ReponseEtudiantConverter;
import ma.sir.alc.ws.dto.ReponseEtudiantDto;
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

@Api("Manages reponseEtudiant services")
@RestController
@RequestMapping("/api/admin/reponseEtudiant/")
public class ReponseEtudiantRestAdmin  extends AbstractController<ReponseEtudiant, ReponseEtudiantDto, ReponseEtudiantHistory, ReponseEtudiantCriteria, ReponseEtudiantHistoryCriteria, ReponseEtudiantAdminService, ReponseEtudiantConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reponseEtudiants")
    @GetMapping("")
    public ResponseEntity<List<ReponseEtudiantDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  reponseEtudiant")
    @PutMapping("")
    public ResponseEntity<ReponseEtudiantDto> update(@RequestBody ReponseEtudiantDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a reponseEtudiant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReponseEtudiantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reponseEtudiant")
    @PostMapping("")
    public ResponseEntity<ReponseEtudiantDto> save(@RequestBody ReponseEtudiantDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of reponseEtudiant")
    @PostMapping("multiple")
    public ResponseEntity<List<ReponseEtudiantDto>> delete(@RequestBody List<ReponseEtudiantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reponseEtudiant")
    @DeleteMapping("")
    public ResponseEntity<ReponseEtudiantDto> delete(@RequestBody ReponseEtudiantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reponseEtudiant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reponseEtudiants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by reponse id")
    @GetMapping("reponse/id/{id}")
    public List<ReponseEtudiant> findByReponseId(@PathVariable Long id){
        return service.findByReponseId(id);
    }
    @ApiOperation("delete by reponse id")
    @DeleteMapping("reponse/id/{id}")
    public int deleteByReponseId(@PathVariable Long id){
        return service.deleteByReponseId(id);
    }
    @ApiOperation("find by quizEtudiant id")
    @GetMapping("quizEtudiant/id/{id}")
    public List<ReponseEtudiant> findByQuizEtudiantId(@PathVariable Long id){
        return service.findByQuizEtudiantId(id);
    }
    @ApiOperation("delete by quizEtudiant id")
    @DeleteMapping("quizEtudiant/id/{id}")
    public int deleteByQuizEtudiantId(@PathVariable Long id){
        return service.deleteByQuizEtudiantId(id);
    }
    @ApiOperation("find by question id")
    @GetMapping("question/id/{id}")
    public List<ReponseEtudiant> findByQuestionId(@PathVariable Long id){
        return service.findByQuestionId(id);
    }
    @ApiOperation("delete by question id")
    @DeleteMapping("question/id/{id}")
    public int deleteByQuestionId(@PathVariable Long id){
        return service.deleteByQuestionId(id);
    }
    @ApiOperation("Finds reponseEtudiants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReponseEtudiantDto>> findByCriteria(@RequestBody ReponseEtudiantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reponseEtudiants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReponseEtudiantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReponseEtudiantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reponseEtudiant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReponseEtudiantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reponseEtudiant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reponseEtudiant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReponseEtudiantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReponseEtudiantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reponseEtudiant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReponseEtudiantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReponseEtudiantRestAdmin (ReponseEtudiantAdminService service, ReponseEtudiantConverter converter) {
        super(service, converter);
    }


}