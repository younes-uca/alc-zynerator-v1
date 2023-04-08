package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ResultatHomeWork;
import ma.sir.alc.bean.history.ResultatHomeWorkHistory;
import ma.sir.alc.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.sir.alc.dao.criteria.history.ResultatHomeWorkHistoryCriteria;
import ma.sir.alc.service.facade.admin.ResultatHomeWorkAdminService;
import ma.sir.alc.ws.converter.ResultatHomeWorkConverter;
import ma.sir.alc.ws.dto.ResultatHomeWorkDto;
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

@Api("Manages resultatHomeWork services")
@RestController
@RequestMapping("/api/admin/resultatHomeWork/")
public class ResultatHomeWorkRestAdmin  extends AbstractController<ResultatHomeWork, ResultatHomeWorkDto, ResultatHomeWorkHistory, ResultatHomeWorkCriteria, ResultatHomeWorkHistoryCriteria, ResultatHomeWorkAdminService, ResultatHomeWorkConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all resultatHomeWorks")
    @GetMapping("")
    public ResponseEntity<List<ResultatHomeWorkDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  resultatHomeWork")
    @PutMapping("")
    public ResponseEntity<ResultatHomeWorkDto> update(@RequestBody ResultatHomeWorkDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a resultatHomeWork by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ResultatHomeWorkDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  resultatHomeWork")
    @PostMapping("")
    public ResponseEntity<ResultatHomeWorkDto> save(@RequestBody ResultatHomeWorkDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of resultatHomeWork")
    @PostMapping("multiple")
    public ResponseEntity<List<ResultatHomeWorkDto>> delete(@RequestBody List<ResultatHomeWorkDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified resultatHomeWork")
    @DeleteMapping("")
    public ResponseEntity<ResultatHomeWorkDto> delete(@RequestBody ResultatHomeWorkDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified resultatHomeWork")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple resultatHomeWorks by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds resultatHomeWorks by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ResultatHomeWorkDto>> findByCriteria(@RequestBody ResultatHomeWorkCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated resultatHomeWorks by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ResultatHomeWorkCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports resultatHomeWorks by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ResultatHomeWorkCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets resultatHomeWork data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ResultatHomeWorkCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets resultatHomeWork history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets resultatHomeWork paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ResultatHomeWorkHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports resultatHomeWork history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ResultatHomeWorkHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets resultatHomeWork history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ResultatHomeWorkHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ResultatHomeWorkRestAdmin (ResultatHomeWorkAdminService service, ResultatHomeWorkConverter converter) {
        super(service, converter);
    }


}