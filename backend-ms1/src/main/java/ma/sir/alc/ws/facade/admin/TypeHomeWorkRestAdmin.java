package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.TypeHomeWork;
import ma.sir.alc.bean.history.TypeHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.TypeHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.TypeHomeWorkHistoryCriteria;
import ma.sir.alc.service.facade.admin.TypeHomeWorkAdminService;
import ma.sir.alc.ws.converter.TypeHomeWorkConverter;
import ma.sir.alc.ws.dto.TypeHomeWorkDto;
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

@Api("Manages typeHomeWork services")
@RestController
@RequestMapping("/api/admin/typeHomeWork/")
public class TypeHomeWorkRestAdmin  extends AbstractController<TypeHomeWork, TypeHomeWorkDto, TypeHomeWorkHistory, TypeHomeWorkCriteria, TypeHomeWorkHistoryCriteria, TypeHomeWorkAdminService, TypeHomeWorkConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeHomeWorks")
    @GetMapping("")
    public ResponseEntity<List<TypeHomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeHomeWork")
    @PutMapping("")
    public ResponseEntity<TypeHomeWorkDto> update(@RequestBody TypeHomeWorkDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeHomeWork by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeHomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeHomeWork")
    @PostMapping("")
    public ResponseEntity<TypeHomeWorkDto> save(@RequestBody TypeHomeWorkDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeHomeWork")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeHomeWorkDto>> delete(@RequestBody List<TypeHomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeHomeWork")
    @DeleteMapping("")
    public ResponseEntity<TypeHomeWorkDto> delete(@RequestBody TypeHomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeHomeWork")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeHomeWorks by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds typeHomeWorks by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeHomeWorkDto>> findByCriteria(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeHomeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeHomeWorks by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeHomeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeHomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeHomeWork history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeHomeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeHomeWork history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeHomeWork history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeHomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeHomeWorkRestAdmin (TypeHomeWorkAdminService service, TypeHomeWorkConverter converter) {
        super(service, converter);
    }


}