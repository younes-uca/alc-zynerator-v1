package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtatReponse;
import ma.sir.alc.bean.history.EtatReponseHistory;
import ma.sir.alc.dao.criteria.core.EtatReponseCriteria;
import ma.sir.alc.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtatReponseAdminService;
import ma.sir.alc.ws.converter.EtatReponseConverter;
import ma.sir.alc.ws.dto.EtatReponseDto;
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

@Api("Manages etatReponse services")
@RestController
@RequestMapping("/api/admin/etatReponse/")
public class EtatReponseRestAdmin  extends AbstractController<EtatReponse, EtatReponseDto, EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseAdminService, EtatReponseConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatReponses")
    @GetMapping("")
    public ResponseEntity<List<EtatReponseDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etatReponse")
    @PutMapping("")
    public ResponseEntity<EtatReponseDto> update(@RequestBody EtatReponseDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etatReponse by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatReponseDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatReponse")
    @PostMapping("")
    public ResponseEntity<EtatReponseDto> save(@RequestBody EtatReponseDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etatReponse")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatReponseDto>> delete(@RequestBody List<EtatReponseDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatReponse")
    @DeleteMapping("")
    public ResponseEntity<EtatReponseDto> delete(@RequestBody EtatReponseDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatReponse")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatReponses by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds etatReponses by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatReponseDto>> findByCriteria(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatReponses by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReponses by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatReponse data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatReponseCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatReponse history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatReponse paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatReponse history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatReponse history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatReponseHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatReponseRestAdmin (EtatReponseAdminService service, EtatReponseConverter converter) {
        super(service, converter);
    }


}