package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.GroupeEtude;
import ma.sir.alc.bean.history.GroupeEtudeHistory;
import ma.sir.alc.dao.criteria.core.GroupeEtudeCriteria;
import ma.sir.alc.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.sir.alc.service.facade.admin.GroupeEtudeAdminService;
import ma.sir.alc.ws.converter.GroupeEtudeConverter;
import ma.sir.alc.ws.dto.GroupeEtudeDto;
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

@Api("Manages groupeEtude services")
@RestController
@RequestMapping("/api/admin/groupeEtude/")
public class GroupeEtudeRestAdmin  extends AbstractController<GroupeEtude, GroupeEtudeDto, GroupeEtudeHistory, GroupeEtudeCriteria, GroupeEtudeHistoryCriteria, GroupeEtudeAdminService, GroupeEtudeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all groupeEtudes")
    @GetMapping("")
    public ResponseEntity<List<GroupeEtudeDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  groupeEtude")
    @PutMapping("")
    public ResponseEntity<GroupeEtudeDto> update(@RequestBody GroupeEtudeDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a groupeEtude by id")
    @GetMapping("id/{id}")
    public ResponseEntity<GroupeEtudeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  groupeEtude")
    @PostMapping("")
    public ResponseEntity<GroupeEtudeDto> save(@RequestBody GroupeEtudeDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of groupeEtude")
    @PostMapping("multiple")
    public ResponseEntity<List<GroupeEtudeDto>> delete(@RequestBody List<GroupeEtudeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified groupeEtude")
    @DeleteMapping("")
    public ResponseEntity<GroupeEtudeDto> delete(@RequestBody GroupeEtudeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified groupeEtude")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple groupeEtudes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds groupeEtudes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<GroupeEtudeDto>> findByCriteria(@RequestBody GroupeEtudeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated groupeEtudes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GroupeEtudeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtudes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody GroupeEtudeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets groupeEtude data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody GroupeEtudeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets groupeEtude history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets groupeEtude paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody GroupeEtudeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports groupeEtude history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody GroupeEtudeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets groupeEtude history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody GroupeEtudeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public GroupeEtudeRestAdmin (GroupeEtudeAdminService service, GroupeEtudeConverter converter) {
        super(service, converter);
    }


}