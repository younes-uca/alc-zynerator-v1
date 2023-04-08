package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.EtatCours;
import ma.sir.alc.bean.history.EtatCoursHistory;
import ma.sir.alc.dao.criteria.core.EtatCoursCriteria;
import ma.sir.alc.dao.criteria.history.EtatCoursHistoryCriteria;
import ma.sir.alc.service.facade.admin.EtatCoursAdminService;
import ma.sir.alc.ws.converter.EtatCoursConverter;
import ma.sir.alc.ws.dto.EtatCoursDto;
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

@Api("Manages etatCours services")
@RestController
@RequestMapping("/api/admin/etatCours/")
public class EtatCoursRestAdmin  extends AbstractController<EtatCours, EtatCoursDto, EtatCoursHistory, EtatCoursCriteria, EtatCoursHistoryCriteria, EtatCoursAdminService, EtatCoursConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all etatCourss")
    @GetMapping("")
    public ResponseEntity<List<EtatCoursDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  etatCours")
    @PutMapping("")
    public ResponseEntity<EtatCoursDto> update(@RequestBody EtatCoursDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a etatCours by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EtatCoursDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  etatCours")
    @PostMapping("")
    public ResponseEntity<EtatCoursDto> save(@RequestBody EtatCoursDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of etatCours")
    @PostMapping("multiple")
    public ResponseEntity<List<EtatCoursDto>> delete(@RequestBody List<EtatCoursDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified etatCours")
    @DeleteMapping("")
    public ResponseEntity<EtatCoursDto> delete(@RequestBody EtatCoursDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified etatCours")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple etatCourss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds etatCourss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EtatCoursDto>> findByCriteria(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated etatCourss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatCourss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets etatCours data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EtatCoursCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets etatCours history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets etatCours paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports etatCours history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets etatCours history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EtatCoursHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EtatCoursRestAdmin (EtatCoursAdminService service, EtatCoursConverter converter) {
        super(service, converter);
    }


}