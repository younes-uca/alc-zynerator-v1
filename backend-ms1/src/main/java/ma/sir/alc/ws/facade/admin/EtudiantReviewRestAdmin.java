package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtudiantReview;
import ma.sir.alc.bean.history.EtudiantReviewHistory;
import ma.sir.alc.dao.criteria.core.EtudiantReviewCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtudiantReviewAdminService;
import ma.sir.alc.ws.converter.EtudiantReviewConverter;
import ma.sir.alc.ws.dto.EtudiantReviewDto;
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

@Api("Manages etudiantReview services")
@RestController
@RequestMapping("/api/admin/etudiantReview/")
public class EtudiantReviewRestAdmin  extends AbstractController<EtudiantReview, EtudiantReviewDto, EtudiantReviewHistory, EtudiantReviewCriteria, EtudiantReviewHistoryCriteria, EtudiantReviewAdminService, EtudiantReviewConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiantReviews")
    @GetMapping("")
    public ResponseEntity<List<EtudiantReviewDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Finds a etudiantReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Updates the specified  etudiantReview")
    @PutMapping("")
    public ResponseEntity<EtudiantReviewDto> update(@RequestBody EtudiantReviewDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etudiantReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Finds a etudiantReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Finds a etudiantReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiantReview")
    @PostMapping("")
    public ResponseEntity<EtudiantReviewDto> save(@RequestBody EtudiantReviewDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Finds a etudiantReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Delete list of etudiantReview")
    @PostMapping("multiple")
    public ResponseEntity<List<EtudiantReviewDto>> delete(@RequestBody List<EtudiantReviewDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiantReview")
    @DeleteMapping("")
    public ResponseEntity<EtudiantReviewDto> delete(@RequestBody EtudiantReviewDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiantReview")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiantReviews by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<EtudiantReview> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<EtudiantReview> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<EtudiantReview> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("Finds etudiantReviews by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtudiantReviewDto>> findByCriteria(@RequestBody EtudiantReviewCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiantReviews by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantReviewCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantReviews by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantReviewCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiantReview data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantReviewCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiantReview history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiantReview paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantReviewHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantReview history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantReviewHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiantReview history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantReviewHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantReviewRestAdmin (EtudiantReviewAdminService service, EtudiantReviewConverter converter) {
        super(service, converter);
    }


}