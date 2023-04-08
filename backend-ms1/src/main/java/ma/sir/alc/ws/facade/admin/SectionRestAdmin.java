package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Section;
import ma.sir.alc.bean.history.SectionHistory;
import ma.sir.alc.dao.criteria.core.SectionCriteria;
import ma.sir.alc.dao.criteria.history.SectionHistoryCriteria;
import ma.sir.alc.service.facade.admin.SectionAdminService;
import ma.sir.alc.ws.converter.SectionConverter;
import ma.sir.alc.ws.dto.SectionDto;
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

@Api("Manages section services")
@RestController
@RequestMapping("/api/admin/section/")
public class SectionRestAdmin  extends AbstractController<Section, SectionDto, SectionHistory, SectionCriteria, SectionHistoryCriteria, SectionAdminService, SectionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all sections")
    @GetMapping("")
    public ResponseEntity<List<SectionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  section")
    @PutMapping("")
    public ResponseEntity<SectionDto> update(@RequestBody SectionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a section by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SectionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  section")
    @PostMapping("")
    public ResponseEntity<SectionDto> save(@RequestBody SectionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of section")
    @PostMapping("multiple")
    public ResponseEntity<List<SectionDto>> delete(@RequestBody List<SectionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified section")
    @DeleteMapping("")
    public ResponseEntity<SectionDto> delete(@RequestBody SectionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified section")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple sections by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("find by categorieSection id")
    @GetMapping("categorieSection/id/{id}")
    public List<Section> findByCategorieSectionId(@PathVariable Long id){
        return service.findByCategorieSectionId(id);
    }
    @ApiOperation("delete by categorieSection id")
    @DeleteMapping("categorieSection/id/{id}")
    public int deleteByCategorieSectionId(@PathVariable Long id){
        return service.deleteByCategorieSectionId(id);
    }
    @ApiOperation("find by cours id")
    @GetMapping("cours/id/{id}")
    public List<Section> findByCoursId(@PathVariable Long id){
        return service.findByCoursId(id);
    }
    @ApiOperation("delete by cours id")
    @DeleteMapping("cours/id/{id}")
    public int deleteByCoursId(@PathVariable Long id){
        return service.deleteByCoursId(id);
    }
    @ApiOperation("find by sessionCours id")
    @GetMapping("sessionCours/id/{id}")
    public List<Section> findBySessionCoursId(@PathVariable Long id){
        return service.findBySessionCoursId(id);
    }
    @ApiOperation("delete by sessionCours id")
    @DeleteMapping("sessionCours/id/{id}")
    public int deleteBySessionCoursId(@PathVariable Long id){
        return service.deleteBySessionCoursId(id);
    }
    @ApiOperation("Finds a section and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<SectionDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds sections by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SectionDto>> findByCriteria(@RequestBody SectionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated sections by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SectionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sections by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SectionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets section data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SectionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets section history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets section paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SectionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports section history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SectionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets section history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SectionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SectionRestAdmin (SectionAdminService service, SectionConverter converter) {
        super(service, converter);
    }


}