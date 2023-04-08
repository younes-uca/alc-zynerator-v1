package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.TypeDeQuestion;
import ma.sir.alc.bean.history.TypeDeQuestionHistory;
import ma.sir.alc.dao.criteria.core.TypeDeQuestionCriteria;
import ma.sir.alc.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.sir.alc.service.facade.admin.TypeDeQuestionAdminService;
import ma.sir.alc.ws.converter.TypeDeQuestionConverter;
import ma.sir.alc.ws.dto.TypeDeQuestionDto;
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

@Api("Manages typeDeQuestion services")
@RestController
@RequestMapping("/api/admin/typeDeQuestion/")
public class TypeDeQuestionRestAdmin  extends AbstractController<TypeDeQuestion, TypeDeQuestionDto, TypeDeQuestionHistory, TypeDeQuestionCriteria, TypeDeQuestionHistoryCriteria, TypeDeQuestionAdminService, TypeDeQuestionConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeDeQuestions")
    @GetMapping("")
    public ResponseEntity<List<TypeDeQuestionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeDeQuestion")
    @PutMapping("")
    public ResponseEntity<TypeDeQuestionDto> update(@RequestBody TypeDeQuestionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeDeQuestion by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeDeQuestionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeDeQuestion")
    @PostMapping("")
    public ResponseEntity<TypeDeQuestionDto> save(@RequestBody TypeDeQuestionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeDeQuestion")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeDeQuestionDto>> delete(@RequestBody List<TypeDeQuestionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeDeQuestion")
    @DeleteMapping("")
    public ResponseEntity<TypeDeQuestionDto> delete(@RequestBody TypeDeQuestionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeDeQuestion")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeDeQuestions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds typeDeQuestions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeDeQuestionDto>> findByCriteria(@RequestBody TypeDeQuestionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeDeQuestions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeDeQuestionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeDeQuestions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeDeQuestionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeDeQuestion data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeDeQuestionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeDeQuestion history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeDeQuestion paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeDeQuestionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeDeQuestion history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeDeQuestionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeDeQuestion history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeDeQuestionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeDeQuestionRestAdmin (TypeDeQuestionAdminService service, TypeDeQuestionConverter converter) {
        super(service, converter);
    }


}