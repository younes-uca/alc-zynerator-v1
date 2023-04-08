package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtatInscription;
import ma.sir.alc.bean.history.EtatInscriptionHistory;
import ma.sir.alc.dao.criteria.core.EtatInscriptionCriteria;
import ma.sir.alc.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtatInscriptionAdminService;
import ma.sir.alc.ws.converter.EtatInscriptionConverter;
import ma.sir.alc.ws.dto.EtatInscriptionDto;
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

@Api("Manages etatInscription services")
@RestController
@RequestMapping("/api/admin/etatInscription/")
public class EtatInscriptionRestAdmin  extends AbstractController<EtatInscription, EtatInscriptionDto, EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionAdminService, EtatInscriptionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatInscriptions")
    @GetMapping("")
    public ResponseEntity<List<EtatInscriptionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etatInscription")
    @PutMapping("")
    public ResponseEntity<EtatInscriptionDto> update(@RequestBody EtatInscriptionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etatInscription by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatInscriptionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatInscription")
    @PostMapping("")
    public ResponseEntity<EtatInscriptionDto> save(@RequestBody EtatInscriptionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etatInscription")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatInscriptionDto>> delete(@RequestBody List<EtatInscriptionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatInscription")
    @DeleteMapping("")
    public ResponseEntity<EtatInscriptionDto> delete(@RequestBody EtatInscriptionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatInscription")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatInscriptions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds etatInscriptions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatInscriptionDto>> findByCriteria(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatInscriptions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatInscriptions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatInscription data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatInscriptionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatInscription history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatInscription paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatInscription history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatInscription history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatInscriptionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatInscriptionRestAdmin (EtatInscriptionAdminService service, EtatInscriptionConverter converter) {
        super(service, converter);
    }


}