package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ReponseEtudiantHomeWork;
import ma.sir.alc.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.sir.alc.service.facade.admin.ReponseEtudiantHomeWorkAdminService;
import ma.sir.alc.ws.converter.ReponseEtudiantHomeWorkConverter;
import ma.sir.alc.ws.dto.ReponseEtudiantHomeWorkDto;
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

@Api("Manages reponseEtudiantHomeWork services")
@RestController
@RequestMapping("/api/admin/reponseEtudiantHomeWork/")
public class ReponseEtudiantHomeWorkRestAdmin  extends AbstractController<ReponseEtudiantHomeWork, ReponseEtudiantHomeWorkDto, ReponseEtudiantHomeWorkHistory, ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkAdminService, ReponseEtudiantHomeWorkConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reponseEtudiantHomeWorks")
    @GetMapping("")
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  reponseEtudiantHomeWork")
    @PutMapping("")
    public ResponseEntity<ReponseEtudiantHomeWorkDto> update(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a reponseEtudiantHomeWork by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReponseEtudiantHomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  reponseEtudiantHomeWork")
    @PostMapping("")
    public ResponseEntity<ReponseEtudiantHomeWorkDto> save(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of reponseEtudiantHomeWork")
    @PostMapping("multiple")
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> delete(@RequestBody List<ReponseEtudiantHomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified reponseEtudiantHomeWork")
    @DeleteMapping("")
    public ResponseEntity<ReponseEtudiantHomeWorkDto> delete(@RequestBody ReponseEtudiantHomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified reponseEtudiantHomeWork")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reponseEtudiantHomeWorks by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by howeWorkQSTReponse id")
    @GetMapping("howeWorkQSTReponse/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(@PathVariable Long id){
        return service.findByHoweWorkQSTReponseId(id);
    }
    @ApiOperation("delete by howeWorkQSTReponse id")
    @DeleteMapping("howeWorkQSTReponse/id/{id}")
    public int deleteByHoweWorkQSTReponseId(@PathVariable Long id){
        return service.deleteByHoweWorkQSTReponseId(id);
    }
    @ApiOperation("find by homeWorkEtudiant id")
    @GetMapping("homeWorkEtudiant/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(@PathVariable Long id){
        return service.findByHomeWorkEtudiantId(id);
    }
    @ApiOperation("delete by homeWorkEtudiant id")
    @DeleteMapping("homeWorkEtudiant/id/{id}")
    public int deleteByHomeWorkEtudiantId(@PathVariable Long id){
        return service.deleteByHomeWorkEtudiantId(id);
    }
    @ApiOperation("find by homeWorkQuestion id")
    @GetMapping("homeWorkQuestion/id/{id}")
    public List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(@PathVariable Long id){
        return service.findByHomeWorkQuestionId(id);
    }
    @ApiOperation("delete by homeWorkQuestion id")
    @DeleteMapping("homeWorkQuestion/id/{id}")
    public int deleteByHomeWorkQuestionId(@PathVariable Long id){
        return service.deleteByHomeWorkQuestionId(id);
    }
    @ApiOperation("Finds reponseEtudiantHomeWorks by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReponseEtudiantHomeWorkDto>> findByCriteria(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reponseEtudiantHomeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiantHomeWorks by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReponseEtudiantHomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reponseEtudiantHomeWork history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets reponseEtudiantHomeWork history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReponseEtudiantHomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReponseEtudiantHomeWorkRestAdmin (ReponseEtudiantHomeWorkAdminService service, ReponseEtudiantHomeWorkConverter converter) {
        super(service, converter);
    }


}