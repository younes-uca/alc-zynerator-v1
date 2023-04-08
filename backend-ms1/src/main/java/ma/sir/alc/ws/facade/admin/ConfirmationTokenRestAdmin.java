package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.ConfirmationToken;
import ma.sir.alc.bean.history.ConfirmationTokenHistory;
import ma.sir.alc.dao.criteria.core.ConfirmationTokenCriteria;
import ma.sir.alc.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.sir.alc.service.facade.admin.ConfirmationTokenAdminService;
import ma.sir.alc.ws.converter.ConfirmationTokenConverter;
import ma.sir.alc.ws.dto.ConfirmationTokenDto;
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

@Api("Manages confirmationToken services")
@RestController
@RequestMapping("/api/admin/confirmationToken/")
public class ConfirmationTokenRestAdmin  extends AbstractController<ConfirmationToken, ConfirmationTokenDto, ConfirmationTokenHistory, ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria, ConfirmationTokenAdminService, ConfirmationTokenConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all confirmationTokens")
    @GetMapping("")
    public ResponseEntity<List<ConfirmationTokenDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  confirmationToken")
    @PutMapping("")
    public ResponseEntity<ConfirmationTokenDto> update(@RequestBody ConfirmationTokenDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a confirmationToken by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ConfirmationTokenDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  confirmationToken")
    @PostMapping("")
    public ResponseEntity<ConfirmationTokenDto> save(@RequestBody ConfirmationTokenDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of confirmationToken")
    @PostMapping("multiple")
    public ResponseEntity<List<ConfirmationTokenDto>> delete(@RequestBody List<ConfirmationTokenDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified confirmationToken")
    @DeleteMapping("")
    public ResponseEntity<ConfirmationTokenDto> delete(@RequestBody ConfirmationTokenDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified confirmationToken")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple confirmationTokens by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<ConfirmationToken> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds confirmationTokens by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ConfirmationTokenDto>> findByCriteria(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated confirmationTokens by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports confirmationTokens by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets confirmationToken data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ConfirmationTokenCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets confirmationToken history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets confirmationToken paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports confirmationToken history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets confirmationToken history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ConfirmationTokenHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ConfirmationTokenRestAdmin (ConfirmationTokenAdminService service, ConfirmationTokenConverter converter) {
        super(service, converter);
    }


}