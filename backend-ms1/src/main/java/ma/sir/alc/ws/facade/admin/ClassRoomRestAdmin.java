package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ClassRoom;
import ma.sir.alc.bean.history.ClassRoomHistory;
import ma.sir.alc.dao.criteria.core.ClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.sir.alc.service.facade.admin.ClassRoomAdminService;
import ma.sir.alc.ws.converter.ClassRoomConverter;
import ma.sir.alc.ws.dto.ClassRoomDto;
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

@Api("Manages classRoom services")
@RestController
@RequestMapping("/api/admin/classRoom/")
public class ClassRoomRestAdmin  extends AbstractController<ClassRoom, ClassRoomDto, ClassRoomHistory, ClassRoomCriteria, ClassRoomHistoryCriteria, ClassRoomAdminService, ClassRoomConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classRooms")
    @GetMapping("")
    public ResponseEntity<List<ClassRoomDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  classRoom")
    @PutMapping("")
    public ResponseEntity<ClassRoomDto> update(@RequestBody ClassRoomDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a classRoom by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ClassRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classRoom")
    @PostMapping("")
    public ResponseEntity<ClassRoomDto> save(@RequestBody ClassRoomDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of classRoom")
    @PostMapping("multiple")
    public ResponseEntity<List<ClassRoomDto>> delete(@RequestBody List<ClassRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classRoom")
    @DeleteMapping("")
    public ResponseEntity<ClassRoomDto> delete(@RequestBody ClassRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classRoom")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classRooms by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ClassRoom> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds a classRoom and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<ClassRoomDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds classRooms by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ClassRoomDto>> findByCriteria(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classRooms by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classRoom history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classRoom history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classRoom history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassRoomRestAdmin (ClassRoomAdminService service, ClassRoomConverter converter) {
        super(service, converter);
    }


}