package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.TeacherLocality;
import ma.sir.alc.bean.history.TeacherLocalityHistory;
import ma.sir.alc.dao.criteria.core.TeacherLocalityCriteria;
import ma.sir.alc.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.sir.alc.service.facade.admin.TeacherLocalityAdminService;
import ma.sir.alc.ws.converter.TeacherLocalityConverter;
import ma.sir.alc.ws.dto.TeacherLocalityDto;
import ma.sir.alc.zynerator.controller.AbstractController;
import ma.sir.alc.zynerator.dto.AuditEntityDto;
import ma.sir.alc.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.alc.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.sir.alc.zynerator.dto.FileTempDto;

@Api("Manages teacherLocality services")
@RestController
@RequestMapping("/api/admin/teacherLocality/")
public class TeacherLocalityRestAdmin  extends AbstractController<TeacherLocality, TeacherLocalityDto, TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityAdminService, TeacherLocalityConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all teacherLocalitys")
    @GetMapping("")
    public ResponseEntity<List<TeacherLocalityDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  teacherLocality")
    @PutMapping("")
    public ResponseEntity<TeacherLocalityDto> update(@RequestBody TeacherLocalityDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a teacherLocality by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TeacherLocalityDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  teacherLocality")
    @PostMapping("")
    public ResponseEntity<TeacherLocalityDto> save(@RequestBody TeacherLocalityDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of teacherLocality")
    @PostMapping("multiple")
    public ResponseEntity<List<TeacherLocalityDto>> delete(@RequestBody List<TeacherLocalityDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified teacherLocality")
    @DeleteMapping("")
    public ResponseEntity<TeacherLocalityDto> delete(@RequestBody TeacherLocalityDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified teacherLocality")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple teacherLocalitys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds teacherLocalitys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TeacherLocalityDto>> findByCriteria(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated teacherLocalitys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teacherLocalitys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets teacherLocality data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TeacherLocalityCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets teacherLocality history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets teacherLocality paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports teacherLocality history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets teacherLocality history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TeacherLocalityHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets teacherLocality next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public TeacherLocalityRestAdmin (TeacherLocalityAdminService service, TeacherLocalityConverter converter) {
        super(service, converter);
    }


}