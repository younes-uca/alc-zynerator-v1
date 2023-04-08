package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.QuizClassRoom;
import ma.sir.alc.bean.history.QuizClassRoomHistory;
import ma.sir.alc.dao.criteria.core.QuizClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.sir.alc.service.facade.admin.QuizClassRoomAdminService;
import ma.sir.alc.ws.converter.QuizClassRoomConverter;
import ma.sir.alc.ws.dto.QuizClassRoomDto;
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

@Api("Manages quizClassRoom services")
@RestController
@RequestMapping("/api/admin/quizClassRoom/")
public class QuizClassRoomRestAdmin  extends AbstractController<QuizClassRoom, QuizClassRoomDto, QuizClassRoomHistory, QuizClassRoomCriteria, QuizClassRoomHistoryCriteria, QuizClassRoomAdminService, QuizClassRoomConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all quizClassRooms")
    @GetMapping("")
    public ResponseEntity<List<QuizClassRoomDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  quizClassRoom")
    @PutMapping("")
    public ResponseEntity<QuizClassRoomDto> update(@RequestBody QuizClassRoomDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a quizClassRoom by id")
    @GetMapping("id/{id}")
    public ResponseEntity<QuizClassRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  quizClassRoom")
    @PostMapping("")
    public ResponseEntity<QuizClassRoomDto> save(@RequestBody QuizClassRoomDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of quizClassRoom")
    @PostMapping("multiple")
    public ResponseEntity<List<QuizClassRoomDto>> delete(@RequestBody List<QuizClassRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified quizClassRoom")
    @DeleteMapping("")
    public ResponseEntity<QuizClassRoomDto> delete(@RequestBody QuizClassRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified quizClassRoom")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple quizClassRooms by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by classRoom id")
    @GetMapping("classRoom/id/{id}")
    public List<QuizClassRoom> findByClassRoomId(@PathVariable Long id){
        return service.findByClassRoomId(id);
    }
    @ApiOperation("delete by classRoom id")
    @DeleteMapping("classRoom/id/{id}")
    public int deleteByClassRoomId(@PathVariable Long id){
        return service.deleteByClassRoomId(id);
    }
    @ApiOperation("find by quiz id")
    @GetMapping("quiz/id/{id}")
    public List<QuizClassRoom> findByQuizId(@PathVariable Long id){
        return service.findByQuizId(id);
    }
    @ApiOperation("delete by quiz id")
    @DeleteMapping("quiz/id/{id}")
    public int deleteByQuizId(@PathVariable Long id){
        return service.deleteByQuizId(id);
    }
    @ApiOperation("Finds quizClassRooms by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<QuizClassRoomDto>> findByCriteria(@RequestBody QuizClassRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated quizClassRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody QuizClassRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizClassRooms by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody QuizClassRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets quizClassRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody QuizClassRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets quizClassRoom history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets quizClassRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody QuizClassRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports quizClassRoom history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody QuizClassRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets quizClassRoom history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody QuizClassRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public QuizClassRoomRestAdmin (QuizClassRoomAdminService service, QuizClassRoomConverter converter) {
        super(service, converter);
    }


}