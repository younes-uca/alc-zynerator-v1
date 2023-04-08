package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ClassAverageBonusProf;
import ma.sir.alc.bean.history.ClassAverageBonusProfHistory;
import ma.sir.alc.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.sir.alc.service.facade.admin.ClassAverageBonusProfAdminService;
import ma.sir.alc.ws.converter.ClassAverageBonusProfConverter;
import ma.sir.alc.ws.dto.ClassAverageBonusProfDto;
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

@Api("Manages classAverageBonusProf services")
@RestController
@RequestMapping("/api/admin/classAverageBonusProf/")
public class ClassAverageBonusProfRestAdmin  extends AbstractController<ClassAverageBonusProf, ClassAverageBonusProfDto, ClassAverageBonusProfHistory, ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfAdminService, ClassAverageBonusProfConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classAverageBonusProfs")
    @GetMapping("")
    public ResponseEntity<List<ClassAverageBonusProfDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  classAverageBonusProf")
    @PutMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> update(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a classAverageBonusProf by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ClassAverageBonusProfDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classAverageBonusProf")
    @PostMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> save(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of classAverageBonusProf")
    @PostMapping("multiple")
    public ResponseEntity<List<ClassAverageBonusProfDto>> delete(@RequestBody List<ClassAverageBonusProfDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classAverageBonusProf")
    @DeleteMapping("")
    public ResponseEntity<ClassAverageBonusProfDto> delete(@RequestBody ClassAverageBonusProfDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classAverageBonusProf")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classAverageBonusProfs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<ClassAverageBonusProf> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by salary id")
    @GetMapping("salary/id/{id}")
    public List<ClassAverageBonusProf> findBySalaryId(@PathVariable Long id){
        return service.findBySalaryId(id);
    }
    @ApiOperation("delete by salary id")
    @DeleteMapping("salary/id/{id}")
    public int deleteBySalaryId(@PathVariable Long id){
        return service.deleteBySalaryId(id);
    }
    @ApiOperation("Finds classAverageBonusProfs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ClassAverageBonusProfDto>> findByCriteria(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classAverageBonusProfs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonusProfs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classAverageBonusProf data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassAverageBonusProfCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classAverageBonusProf history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classAverageBonusProf paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonusProf history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classAverageBonusProf history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassAverageBonusProfHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassAverageBonusProfRestAdmin (ClassAverageBonusProfAdminService service, ClassAverageBonusProfConverter converter) {
        super(service, converter);
    }


}