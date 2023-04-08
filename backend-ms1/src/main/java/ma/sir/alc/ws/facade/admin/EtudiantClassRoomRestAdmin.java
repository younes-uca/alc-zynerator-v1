package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtudiantClassRoom;
import ma.sir.alc.bean.history.EtudiantClassRoomHistory;
import ma.sir.alc.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.sir.alc.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtudiantClassRoomAdminService;
import ma.sir.alc.ws.converter.EtudiantClassRoomConverter;
import ma.sir.alc.ws.dto.EtudiantClassRoomDto;
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

@Api("Manages etudiantClassRoom services")
@RestController
@RequestMapping("/api/admin/etudiantClassRoom/")
public class EtudiantClassRoomRestAdmin  extends AbstractController<EtudiantClassRoom, EtudiantClassRoomDto, EtudiantClassRoomHistory, EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria, EtudiantClassRoomAdminService, EtudiantClassRoomConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etudiantClassRooms")
    @GetMapping("")
    public ResponseEntity<List<EtudiantClassRoomDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etudiantClassRoom")
    @PutMapping("")
    public ResponseEntity<EtudiantClassRoomDto> update(@RequestBody EtudiantClassRoomDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etudiantClassRoom by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtudiantClassRoomDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etudiantClassRoom")
    @PostMapping("")
    public ResponseEntity<EtudiantClassRoomDto> save(@RequestBody EtudiantClassRoomDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etudiantClassRoom")
    @PostMapping("multiple")
    public ResponseEntity<List<EtudiantClassRoomDto>> delete(@RequestBody List<EtudiantClassRoomDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etudiantClassRoom")
    @DeleteMapping("")
    public ResponseEntity<EtudiantClassRoomDto> delete(@RequestBody EtudiantClassRoomDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etudiantClassRoom")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etudiantClassRooms by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by classRoom id")
    @GetMapping("classRoom/id/{id}")
    public List<EtudiantClassRoom> findByClassRoomId(@PathVariable Long id){
        return service.findByClassRoomId(id);
    }
    @ApiOperation("delete by classRoom id")
    @DeleteMapping("classRoom/id/{id}")
    public int deleteByClassRoomId(@PathVariable Long id){
        return service.deleteByClassRoomId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<EtudiantClassRoom> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds etudiantClassRooms by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtudiantClassRoomDto>> findByCriteria(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etudiantClassRooms by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantClassRooms by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtudiantClassRoomCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etudiantClassRoom paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etudiantClassRoom history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etudiantClassRoom history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtudiantClassRoomHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtudiantClassRoomRestAdmin (EtudiantClassRoomAdminService service, EtudiantClassRoomConverter converter) {
        super(service, converter);
    }


}