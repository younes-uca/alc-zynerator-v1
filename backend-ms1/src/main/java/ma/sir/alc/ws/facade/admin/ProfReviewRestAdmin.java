package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ProfReview;
import ma.sir.alc.bean.history.ProfReviewHistory;
import ma.sir.alc.dao.criteria.core.ProfReviewCriteria;
import ma.sir.alc.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.sir.alc.service.facade.admin.ProfReviewAdminService;
import ma.sir.alc.ws.converter.ProfReviewConverter;
import ma.sir.alc.ws.dto.ProfReviewDto;
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

@Api("Manages profReview services")
@RestController
@RequestMapping("/api/admin/profReview/")
public class ProfReviewRestAdmin  extends AbstractController<ProfReview, ProfReviewDto, ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewAdminService, ProfReviewConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all profReviews")
    @GetMapping("")
    public ResponseEntity<List<ProfReviewDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Updates the specified  profReview")
    @PutMapping("")
    public ResponseEntity<ProfReviewDto> update(@RequestBody ProfReviewDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  profReview")
    @PostMapping("")
    public ResponseEntity<ProfReviewDto> save(@RequestBody ProfReviewDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Finds a profReview by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfReviewDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Delete list of profReview")
    @PostMapping("multiple")
    public ResponseEntity<List<ProfReviewDto>> delete(@RequestBody List<ProfReviewDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified profReview")
    @DeleteMapping("")
    public ResponseEntity<ProfReviewDto> delete(@RequestBody ProfReviewDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified profReview")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple profReviews by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<ProfReview> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ProfReview> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<ProfReview> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("Finds profReviews by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProfReviewDto>> findByCriteria(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated profReviews by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profReviews by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets profReview data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProfReviewCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets profReview history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets profReview paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profReview history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets profReview history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProfReviewHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProfReviewRestAdmin (ProfReviewAdminService service, ProfReviewConverter converter) {
        super(service, converter);
    }


}