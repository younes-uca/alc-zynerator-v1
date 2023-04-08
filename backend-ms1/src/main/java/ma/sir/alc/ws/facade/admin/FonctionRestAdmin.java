package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Fonction;
import ma.sir.alc.bean.history.FonctionHistory;
import ma.sir.alc.dao.criteria.core.FonctionCriteria;
import ma.sir.alc.dao.criteria.history.FonctionHistoryCriteria;
import ma.sir.alc.service.facade.admin.FonctionAdminService;
import ma.sir.alc.ws.converter.FonctionConverter;
import ma.sir.alc.ws.dto.FonctionDto;
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

@Api("Manages fonction services")
@RestController
@RequestMapping("/api/admin/fonction/")
public class FonctionRestAdmin  extends AbstractController<Fonction, FonctionDto, FonctionHistory, FonctionCriteria, FonctionHistoryCriteria, FonctionAdminService, FonctionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all fonctions")
    @GetMapping("")
    public ResponseEntity<List<FonctionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  fonction")
    @PutMapping("")
    public ResponseEntity<FonctionDto> update(@RequestBody FonctionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a fonction by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FonctionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  fonction")
    @PostMapping("")
    public ResponseEntity<FonctionDto> save(@RequestBody FonctionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of fonction")
    @PostMapping("multiple")
    public ResponseEntity<List<FonctionDto>> delete(@RequestBody List<FonctionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified fonction")
    @DeleteMapping("")
    public ResponseEntity<FonctionDto> delete(@RequestBody FonctionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified fonction")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple fonctions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds fonctions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FonctionDto>> findByCriteria(@RequestBody FonctionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated fonctions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FonctionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports fonctions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FonctionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets fonction data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FonctionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets fonction history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets fonction paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FonctionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports fonction history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FonctionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets fonction history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FonctionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FonctionRestAdmin (FonctionAdminService service, FonctionConverter converter) {
        super(service, converter);
    }


}