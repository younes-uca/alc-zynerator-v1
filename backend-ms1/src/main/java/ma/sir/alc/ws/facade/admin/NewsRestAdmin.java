package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.News;
import ma.sir.alc.bean.history.NewsHistory;
import ma.sir.alc.dao.criteria.core.NewsCriteria;
import ma.sir.alc.dao.criteria.history.NewsHistoryCriteria;
import ma.sir.alc.service.facade.admin.NewsAdminService;
import ma.sir.alc.ws.converter.NewsConverter;
import ma.sir.alc.ws.dto.NewsDto;
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

@Api("Manages news services")
@RestController
@RequestMapping("/api/admin/news/")
public class NewsRestAdmin  extends AbstractController<News, NewsDto, NewsHistory, NewsCriteria, NewsHistoryCriteria, NewsAdminService, NewsConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all newss")
    @GetMapping("")
    public ResponseEntity<List<NewsDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  news")
    @PutMapping("")
    public ResponseEntity<NewsDto> update(@RequestBody NewsDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a news by id")
    @GetMapping("id/{id}")
    public ResponseEntity<NewsDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  news")
    @PostMapping("")
    public ResponseEntity<NewsDto> save(@RequestBody NewsDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of news")
    @PostMapping("multiple")
    public ResponseEntity<List<NewsDto>> delete(@RequestBody List<NewsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified news")
    @DeleteMapping("")
    public ResponseEntity<NewsDto> delete(@RequestBody NewsDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified news")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple newss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds newss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<NewsDto>> findByCriteria(@RequestBody NewsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated newss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody NewsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports newss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody NewsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets news data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody NewsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets news history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets news paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody NewsHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports news history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody NewsHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets news history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody NewsHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public NewsRestAdmin (NewsAdminService service, NewsConverter converter) {
        super(service, converter);
    }


}