package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Price;
import ma.sir.alc.bean.history.PriceHistory;
import ma.sir.alc.dao.criteria.core.PriceCriteria;
import ma.sir.alc.dao.criteria.history.PriceHistoryCriteria;
import ma.sir.alc.service.facade.admin.PriceAdminService;
import ma.sir.alc.ws.converter.PriceConverter;
import ma.sir.alc.ws.dto.PriceDto;
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

@Api("Manages price services")
@RestController
@RequestMapping("/api/admin/price/")
public class PriceRestAdmin  extends AbstractController<Price, PriceDto, PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceAdminService, PriceConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all prices")
    @GetMapping("")
    public ResponseEntity<List<PriceDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  price")
    @PutMapping("")
    public ResponseEntity<PriceDto> update(@RequestBody PriceDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a price by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PriceDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  price")
    @PostMapping("")
    public ResponseEntity<PriceDto> save(@RequestBody PriceDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of price")
    @PostMapping("multiple")
    public ResponseEntity<List<PriceDto>> delete(@RequestBody List<PriceDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified price")
    @DeleteMapping("")
    public ResponseEntity<PriceDto> delete(@RequestBody PriceDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified price")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple prices by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds prices by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PriceDto>> findByCriteria(@RequestBody PriceCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated prices by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PriceCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prices by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PriceCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets price data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PriceCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets price history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets price paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports price history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets price history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PriceHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PriceRestAdmin (PriceAdminService service, PriceConverter converter) {
        super(service, converter);
    }


}