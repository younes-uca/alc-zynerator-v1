package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Prof;
import ma.sir.alc.bean.history.ProfHistory;
import ma.sir.alc.dao.criteria.core.ProfCriteria;
import ma.sir.alc.dao.criteria.history.ProfHistoryCriteria;
import ma.sir.alc.service.facade.admin.ProfAdminService;
import ma.sir.alc.ws.converter.ProfConverter;
import ma.sir.alc.ws.dto.ProfDto;
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

@Api("Manages prof services")
@RestController
@RequestMapping("/api/admin/prof/")
public class ProfRestAdmin  extends AbstractController<Prof, ProfDto, ProfHistory, ProfCriteria, ProfHistoryCriteria, ProfAdminService, ProfConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all profs")
    @GetMapping("")
    public ResponseEntity<List<ProfDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  prof")
    @PutMapping("")
    public ResponseEntity<ProfDto> update(@RequestBody ProfDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a prof by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  prof")
    @PostMapping("")
    public ResponseEntity<ProfDto> save(@RequestBody ProfDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of prof")
    @PostMapping("multiple")
    public ResponseEntity<List<ProfDto>> delete(@RequestBody List<ProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified prof")
    @DeleteMapping("")
    public ResponseEntity<ProfDto> delete(@RequestBody ProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified prof")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple profs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by levelMin id")
    @GetMapping("levelMin/id/{id}")
    public List<Prof> findByLevelMinId(@PathVariable Long id){
        return service.findByLevelMinId(id);
    }
    @ApiOperation("delete by levelMin id")
    @DeleteMapping("levelMin/id/{id}")
    public int deleteByLevelMinId(@PathVariable Long id){
        return service.deleteByLevelMinId(id);
    }
    @ApiOperation("find by levelMax id")
    @GetMapping("levelMax/id/{id}")
    public List<Prof> findByLevelMaxId(@PathVariable Long id){
        return service.findByLevelMaxId(id);
    }
    @ApiOperation("delete by levelMax id")
    @DeleteMapping("levelMax/id/{id}")
    public int deleteByLevelMaxId(@PathVariable Long id){
        return service.deleteByLevelMaxId(id);
    }
    @ApiOperation("find by categorieProf id")
    @GetMapping("categorieProf/id/{id}")
    public List<Prof> findByCategorieProfId(@PathVariable Long id){
        return service.findByCategorieProfId(id);
    }
    @ApiOperation("delete by categorieProf id")
    @DeleteMapping("categorieProf/id/{id}")
    public int deleteByCategorieProfId(@PathVariable Long id){
        return service.deleteByCategorieProfId(id);
    }
    @ApiOperation("find by typeTeacher id")
    @GetMapping("typeTeacher/id/{id}")
    public List<Prof> findByTypeTeacherId(@PathVariable Long id){
        return service.findByTypeTeacherId(id);
    }
    @ApiOperation("delete by typeTeacher id")
    @DeleteMapping("typeTeacher/id/{id}")
    public int deleteByTypeTeacherId(@PathVariable Long id){
        return service.deleteByTypeTeacherId(id);
    }
    @ApiOperation("Finds a prof and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<ProfDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds profs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ProfDto>> findByCriteria(@RequestBody ProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated profs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports profs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets prof data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets prof history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets prof paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prof history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets prof history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ProfRestAdmin (ProfAdminService service, ProfConverter converter) {
        super(service, converter);
    }


}