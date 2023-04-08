package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Dictionary;
import ma.sir.alc.bean.history.DictionaryHistory;
import ma.sir.alc.dao.criteria.core.DictionaryCriteria;
import ma.sir.alc.dao.criteria.history.DictionaryHistoryCriteria;
import ma.sir.alc.service.facade.admin.DictionaryAdminService;
import ma.sir.alc.ws.converter.DictionaryConverter;
import ma.sir.alc.ws.dto.DictionaryDto;
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

@Api("Manages dictionary services")
@RestController
@RequestMapping("/api/admin/dictionary/")
public class DictionaryRestAdmin  extends AbstractController<Dictionary, DictionaryDto, DictionaryHistory, DictionaryCriteria, DictionaryHistoryCriteria, DictionaryAdminService, DictionaryConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all dictionarys")
    @GetMapping("")
    public ResponseEntity<List<DictionaryDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  dictionary")
    @PutMapping("")
    public ResponseEntity<DictionaryDto> update(@RequestBody DictionaryDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a dictionary by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DictionaryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  dictionary")
    @PostMapping("")
    public ResponseEntity<DictionaryDto> save(@RequestBody DictionaryDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of dictionary")
    @PostMapping("multiple")
    public ResponseEntity<List<DictionaryDto>> delete(@RequestBody List<DictionaryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified dictionary")
    @DeleteMapping("")
    public ResponseEntity<DictionaryDto> delete(@RequestBody DictionaryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified dictionary")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple dictionarys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by etudiant id")
    @GetMapping("etudiant/id/{id}")
    public List<Dictionary> findByEtudiantId(@PathVariable Long id){
        return service.findByEtudiantId(id);
    }
    @ApiOperation("delete by etudiant id")
    @DeleteMapping("etudiant/id/{id}")
    public int deleteByEtudiantId(@PathVariable Long id){
        return service.deleteByEtudiantId(id);
    }
    @ApiOperation("Finds dictionarys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DictionaryDto>> findByCriteria(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated dictionarys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dictionarys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets dictionary data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DictionaryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets dictionary history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets dictionary paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dictionary history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets dictionary history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DictionaryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DictionaryRestAdmin (DictionaryAdminService service, DictionaryConverter converter) {
        super(service, converter);
    }


}