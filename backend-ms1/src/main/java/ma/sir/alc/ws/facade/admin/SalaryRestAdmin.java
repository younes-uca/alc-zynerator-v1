package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Salary;
import ma.sir.alc.bean.history.SalaryHistory;
import ma.sir.alc.dao.criteria.core.SalaryCriteria;
import ma.sir.alc.dao.criteria.history.SalaryHistoryCriteria;
import ma.sir.alc.service.facade.admin.SalaryAdminService;
import ma.sir.alc.ws.converter.SalaryConverter;
import ma.sir.alc.ws.dto.SalaryDto;
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

@Api("Manages salary services")
@RestController
@RequestMapping("/api/admin/salary/")
public class SalaryRestAdmin  extends AbstractController<Salary, SalaryDto, SalaryHistory, SalaryCriteria, SalaryHistoryCriteria, SalaryAdminService, SalaryConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all salarys")
    @GetMapping("")
    public ResponseEntity<List<SalaryDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  salary")
    @PutMapping("")
    public ResponseEntity<SalaryDto> update(@RequestBody SalaryDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a salary by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SalaryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  salary")
    @PostMapping("")
    public ResponseEntity<SalaryDto> save(@RequestBody SalaryDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of salary")
    @PostMapping("multiple")
    public ResponseEntity<List<SalaryDto>> delete(@RequestBody List<SalaryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified salary")
    @DeleteMapping("")
    public ResponseEntity<SalaryDto> delete(@RequestBody SalaryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified salary")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple salarys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<Salary> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("Finds salarys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SalaryDto>> findByCriteria(@RequestBody SalaryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated salarys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SalaryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports salarys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SalaryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets salary data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SalaryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets salary history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets salary paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SalaryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports salary history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SalaryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets salary history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SalaryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SalaryRestAdmin (SalaryAdminService service, SalaryConverter converter) {
        super(service, converter);
    }


}