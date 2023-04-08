package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.CategorieSection;
import ma.sir.alc.bean.history.CategorieSectionHistory;
import ma.sir.alc.dao.criteria.core.CategorieSectionCriteria;
import ma.sir.alc.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.sir.alc.service.facade.admin.CategorieSectionAdminService;
import ma.sir.alc.ws.converter.CategorieSectionConverter;
import ma.sir.alc.ws.dto.CategorieSectionDto;
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

@Api("Manages categorieSection services")
@RestController
@RequestMapping("/api/admin/categorieSection/")
public class CategorieSectionRestAdmin  extends AbstractController<CategorieSection, CategorieSectionDto, CategorieSectionHistory, CategorieSectionCriteria, CategorieSectionHistoryCriteria, CategorieSectionAdminService, CategorieSectionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all categorieSections")
    @GetMapping("")
    public ResponseEntity<List<CategorieSectionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  categorieSection")
    @PutMapping("")
    public ResponseEntity<CategorieSectionDto> update(@RequestBody CategorieSectionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a categorieSection by id")
    @GetMapping("id/{id}")
    public ResponseEntity<CategorieSectionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categorieSection")
    @PostMapping("")
    public ResponseEntity<CategorieSectionDto> save(@RequestBody CategorieSectionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of categorieSection")
    @PostMapping("multiple")
    public ResponseEntity<List<CategorieSectionDto>> delete(@RequestBody List<CategorieSectionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categorieSection")
    @DeleteMapping("")
    public ResponseEntity<CategorieSectionDto> delete(@RequestBody CategorieSectionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified categorieSection")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple categorieSections by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by superCategorieSection id")
    @GetMapping("superCategorieSection/id/{id}")
    public List<CategorieSection> findBySuperCategorieSectionId(@PathVariable Long id){
        return service.findBySuperCategorieSectionId(id);
    }
    @ApiOperation("delete by superCategorieSection id")
    @DeleteMapping("superCategorieSection/id/{id}")
    public int deleteBySuperCategorieSectionId(@PathVariable Long id){
        return service.deleteBySuperCategorieSectionId(id);
    }
    @ApiOperation("Finds a categorieSection and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<CategorieSectionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds categorieSections by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<CategorieSectionDto>> findByCriteria(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categorieSections by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieSections by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categorieSection data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategorieSectionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categorieSection history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categorieSection paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categorieSection history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categorieSection history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategorieSectionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public CategorieSectionRestAdmin (CategorieSectionAdminService service, CategorieSectionConverter converter) {
        super(service, converter);
    }


}