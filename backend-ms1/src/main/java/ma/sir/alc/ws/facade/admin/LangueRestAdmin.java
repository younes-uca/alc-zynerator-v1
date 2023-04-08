package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Langue;
import ma.sir.alc.bean.history.LangueHistory;
import ma.sir.alc.dao.criteria.core.LangueCriteria;
import ma.sir.alc.dao.criteria.history.LangueHistoryCriteria;
import ma.sir.alc.service.facade.admin.LangueAdminService;
import ma.sir.alc.ws.converter.LangueConverter;
import ma.sir.alc.ws.dto.LangueDto;
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

@Api("Manages langue services")
@RestController
@RequestMapping("/api/admin/langue/")
public class LangueRestAdmin  extends AbstractController<Langue, LangueDto, LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueAdminService, LangueConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all langues")
    @GetMapping("")
    public ResponseEntity<List<LangueDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  langue")
    @PutMapping("")
    public ResponseEntity<LangueDto> update(@RequestBody LangueDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a langue by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LangueDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  langue")
    @PostMapping("")
    public ResponseEntity<LangueDto> save(@RequestBody LangueDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of langue")
    @PostMapping("multiple")
    public ResponseEntity<List<LangueDto>> delete(@RequestBody List<LangueDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified langue")
    @DeleteMapping("")
    public ResponseEntity<LangueDto> delete(@RequestBody LangueDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified langue")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple langues by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds langues by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LangueDto>> findByCriteria(@RequestBody LangueCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated langues by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LangueCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports langues by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LangueCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets langue data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LangueCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets langue history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets langue paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports langue history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets langue history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LangueHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LangueRestAdmin (LangueAdminService service, LangueConverter converter) {
        super(service, converter);
    }


}