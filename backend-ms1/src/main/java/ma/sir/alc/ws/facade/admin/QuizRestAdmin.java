package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Quiz;
import ma.sir.alc.bean.history.QuizHistory;
import ma.sir.alc.dao.criteria.core.QuizCriteria;
import ma.sir.alc.dao.criteria.history.QuizHistoryCriteria;
import ma.sir.alc.service.facade.admin.QuizAdminService;
import ma.sir.alc.ws.converter.QuizConverter;
import ma.sir.alc.ws.dto.QuizDto;
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

@Api("Manages quiz services")
@RestController
@RequestMapping("/api/admin/quiz/")
public class QuizRestAdmin  extends AbstractController<Quiz, QuizDto, QuizHistory, QuizCriteria, QuizHistoryCriteria, QuizAdminService, QuizConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all quizs")
    @GetMapping("")
    public ResponseEntity<List<QuizDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  quiz")
    @PutMapping("")
    public ResponseEntity<QuizDto> update(@RequestBody QuizDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a quiz by id")
    @GetMapping("id/{id}")
    public ResponseEntity<QuizDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  quiz")
    @PostMapping("")
    public ResponseEntity<QuizDto> save(@RequestBody QuizDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of quiz")
    @PostMapping("multiple")
    public ResponseEntity<List<QuizDto>> delete(@RequestBody List<QuizDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified quiz")
    @DeleteMapping("")
    public ResponseEntity<QuizDto> delete(@RequestBody QuizDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified quiz")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple quizs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by section id")
    @GetMapping("section/id/{id}")
    public List<Quiz> findBySectionId(@PathVariable Long id){
        return service.findBySectionId(id);
    }
    @ApiOperation("delete by section id")
    @DeleteMapping("section/id/{id}")
    public int deleteBySectionId(@PathVariable Long id){
        return service.deleteBySectionId(id);
    }
    @ApiOperation("Finds a quiz and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<QuizDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds quizs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<QuizDto>> findByCriteria(@RequestBody QuizCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated quizs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody QuizCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody QuizCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets quiz data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody QuizCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets quiz history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets quiz paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quiz history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets quiz history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody QuizHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public QuizRestAdmin (QuizAdminService service, QuizConverter converter) {
        super(service, converter);
    }


}