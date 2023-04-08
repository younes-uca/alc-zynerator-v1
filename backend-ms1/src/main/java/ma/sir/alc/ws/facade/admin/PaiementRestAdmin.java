package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Paiement;
import ma.sir.alc.bean.history.PaiementHistory;
import ma.sir.alc.dao.criteria.core.PaiementCriteria;
import ma.sir.alc.dao.criteria.history.PaiementHistoryCriteria;
import ma.sir.alc.service.facade.admin.PaiementAdminService;
import ma.sir.alc.ws.converter.PaiementConverter;
import ma.sir.alc.ws.dto.PaiementDto;
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

@Api("Manages paiement services")
@RestController
@RequestMapping("/api/admin/paiement/")
public class PaiementRestAdmin  extends AbstractController<Paiement, PaiementDto, PaiementHistory, PaiementCriteria, PaiementHistoryCriteria, PaiementAdminService, PaiementConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all paiements")
    @GetMapping("")
    public ResponseEntity<List<PaiementDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  paiement")
    @PutMapping("")
    public ResponseEntity<PaiementDto> update(@RequestBody PaiementDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a paiement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PaiementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  paiement")
    @PostMapping("")
    public ResponseEntity<PaiementDto> save(@RequestBody PaiementDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of paiement")
    @PostMapping("multiple")
    public ResponseEntity<List<PaiementDto>> delete(@RequestBody List<PaiementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified paiement")
    @DeleteMapping("")
    public ResponseEntity<PaiementDto> delete(@RequestBody PaiementDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified paiement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple paiements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by prof id")
    @GetMapping("prof/id/{id}")
    public List<Paiement> findByProfId(@PathVariable Long id){
        return service.findByProfId(id);
    }
    @ApiOperation("delete by prof id")
    @DeleteMapping("prof/id/{id}")
    public int deleteByProfId(@PathVariable Long id){
        return service.deleteByProfId(id);
    }
    @ApiOperation("find by groupeEtudiant id")
    @GetMapping("groupeEtudiant/id/{id}")
    public List<Paiement> findByGroupeEtudiantId(@PathVariable Long id){
        return service.findByGroupeEtudiantId(id);
    }
    @ApiOperation("delete by groupeEtudiant id")
    @DeleteMapping("groupeEtudiant/id/{id}")
    public int deleteByGroupeEtudiantId(@PathVariable Long id){
        return service.deleteByGroupeEtudiantId(id);
    }
    @ApiOperation("Finds paiements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PaiementDto>> findByCriteria(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated paiements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports paiements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets paiement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PaiementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets paiement history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets paiement paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PaiementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports paiement history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PaiementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets paiement history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PaiementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PaiementRestAdmin (PaiementAdminService service, PaiementConverter converter) {
        super(service, converter);
    }


}