package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.FreeTrialDetail;
import ma.sir.alc.bean.history.FreeTrialDetailHistory;
import ma.sir.alc.dao.criteria.core.FreeTrialDetailCriteria;
import ma.sir.alc.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.sir.alc.service.facade.admin.FreeTrialDetailAdminService;
import ma.sir.alc.ws.converter.FreeTrialDetailConverter;
import ma.sir.alc.ws.dto.FreeTrialDetailDto;
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

@Api("Manages freeTrialDetail services")
@RestController
@RequestMapping("/api/admin/freeTrialDetail/")
public class FreeTrialDetailRestAdmin  extends AbstractController<FreeTrialDetail, FreeTrialDetailDto, FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailAdminService, FreeTrialDetailConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all freeTrialDetails")
    @GetMapping("")
    public ResponseEntity<List<FreeTrialDetailDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  freeTrialDetail")
    @PutMapping("")
    public ResponseEntity<FreeTrialDetailDto> update(@RequestBody FreeTrialDetailDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a freeTrialDetail by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FreeTrialDetailDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  freeTrialDetail")
    @PostMapping("")
    public ResponseEntity<FreeTrialDetailDto> save(@RequestBody FreeTrialDetailDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of freeTrialDetail")
    @PostMapping("multiple")
    public ResponseEntity<List<FreeTrialDetailDto>> delete(@RequestBody List<FreeTrialDetailDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified freeTrialDetail")
    @DeleteMapping("")
    public ResponseEntity<FreeTrialDetailDto> delete(@RequestBody FreeTrialDetailDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified freeTrialDetail")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple freeTrialDetails by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by freeTrial id")
    @GetMapping("freeTrial/id/{id}")
    public List<FreeTrialDetail> findByFreeTrialId(@PathVariable Long id){
        return service.findByFreeTrialId(id);
    }
    @ApiOperation("delete by freeTrial id")
    @DeleteMapping("freeTrial/id/{id}")
    public int deleteByFreeTrialId(@PathVariable Long id){
        return service.deleteByFreeTrialId(id);
    }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<FreeTrialDetail> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds freeTrialDetails by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FreeTrialDetailDto>> findByCriteria(@RequestBody FreeTrialDetailCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated freeTrialDetails by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FreeTrialDetailCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialDetails by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FreeTrialDetailCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets freeTrialDetail data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FreeTrialDetailCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets freeTrialDetail history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets freeTrialDetail paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FreeTrialDetailHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports freeTrialDetail history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FreeTrialDetailHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets freeTrialDetail history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FreeTrialDetailHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FreeTrialDetailRestAdmin (FreeTrialDetailAdminService service, FreeTrialDetailConverter converter) {
        super(service, converter);
    }


}