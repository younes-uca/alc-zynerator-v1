package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Parcours;
import ma.sir.alc.bean.history.ParcoursHistory;
import ma.sir.alc.dao.criteria.core.ParcoursCriteria;
import ma.sir.alc.dao.criteria.history.ParcoursHistoryCriteria;
import ma.sir.alc.service.facade.admin.ParcoursAdminService;
import ma.sir.alc.ws.converter.ParcoursConverter;
import ma.sir.alc.ws.dto.ParcoursDto;
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

@Api("Manages parcours services")
@RestController
@RequestMapping("/api/admin/parcours/")
public class ParcoursRestAdmin  extends AbstractController<Parcours, ParcoursDto, ParcoursHistory, ParcoursCriteria, ParcoursHistoryCriteria, ParcoursAdminService, ParcoursConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all parcourss")
    @GetMapping("")
    public ResponseEntity<List<ParcoursDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  parcours")
    @PutMapping("")
    public ResponseEntity<ParcoursDto> update(@RequestBody ParcoursDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a parcours by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ParcoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  parcours")
    @PostMapping("")
    public ResponseEntity<ParcoursDto> save(@RequestBody ParcoursDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of parcours")
    @PostMapping("multiple")
    public ResponseEntity<List<ParcoursDto>> delete(@RequestBody List<ParcoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified parcours")
    @DeleteMapping("")
    public ResponseEntity<ParcoursDto> delete(@RequestBody ParcoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified parcours")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple parcourss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by centre id")
    @GetMapping("centre/id/{id}")
    public List<Parcours> findByCentreId(@PathVariable Long id){
        return service.findByCentreId(id);
    }
    @ApiOperation("delete by centre id")
    @DeleteMapping("centre/id/{id}")
    public int deleteByCentreId(@PathVariable Long id){
        return service.deleteByCentreId(id);
    }
    @ApiOperation("Finds a parcours and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<ParcoursDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds parcourss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ParcoursDto>> findByCriteria(@RequestBody ParcoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated parcourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ParcoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports parcourss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ParcoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets parcours data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ParcoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets parcours history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets parcours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ParcoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports parcours history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ParcoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets parcours history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ParcoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ParcoursRestAdmin (ParcoursAdminService service, ParcoursConverter converter) {
        super(service, converter);
    }


}