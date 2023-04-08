package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ClassAverageBonus;
import ma.sir.alc.bean.history.ClassAverageBonusHistory;
import ma.sir.alc.dao.criteria.core.ClassAverageBonusCriteria;
import ma.sir.alc.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.sir.alc.service.facade.admin.ClassAverageBonusAdminService;
import ma.sir.alc.ws.converter.ClassAverageBonusConverter;
import ma.sir.alc.ws.dto.ClassAverageBonusDto;
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

@Api("Manages classAverageBonus services")
@RestController
@RequestMapping("/api/admin/classAverageBonus/")
public class ClassAverageBonusRestAdmin  extends AbstractController<ClassAverageBonus, ClassAverageBonusDto, ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusAdminService, ClassAverageBonusConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all classAverageBonuss")
    @GetMapping("")
    public ResponseEntity<List<ClassAverageBonusDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  classAverageBonus")
    @PutMapping("")
    public ResponseEntity<ClassAverageBonusDto> update(@RequestBody ClassAverageBonusDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a classAverageBonus by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ClassAverageBonusDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classAverageBonus")
    @PostMapping("")
    public ResponseEntity<ClassAverageBonusDto> save(@RequestBody ClassAverageBonusDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of classAverageBonus")
    @PostMapping("multiple")
    public ResponseEntity<List<ClassAverageBonusDto>> delete(@RequestBody List<ClassAverageBonusDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classAverageBonus")
    @DeleteMapping("")
    public ResponseEntity<ClassAverageBonusDto> delete(@RequestBody ClassAverageBonusDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified classAverageBonus")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple classAverageBonuss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds classAverageBonuss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ClassAverageBonusDto>> findByCriteria(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classAverageBonuss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonuss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classAverageBonus data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassAverageBonusCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classAverageBonus history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classAverageBonus paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classAverageBonus history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classAverageBonus history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassAverageBonusHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ClassAverageBonusRestAdmin (ClassAverageBonusAdminService service, ClassAverageBonusConverter converter) {
        super(service, converter);
    }


}