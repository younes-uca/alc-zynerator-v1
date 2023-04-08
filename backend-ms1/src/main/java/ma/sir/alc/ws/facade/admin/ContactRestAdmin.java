package  ma.sir.alc.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.alc.bean.core.Contact;
import ma.sir.alc.bean.history.ContactHistory;
import ma.sir.alc.dao.criteria.core.ContactCriteria;
import ma.sir.alc.dao.criteria.history.ContactHistoryCriteria;
import ma.sir.alc.service.facade.admin.ContactAdminService;
import ma.sir.alc.ws.converter.ContactConverter;
import ma.sir.alc.ws.dto.ContactDto;
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

@Api("Manages contact services")
@RestController
@RequestMapping("/api/admin/contact/")
public class ContactRestAdmin  extends AbstractController<Contact, ContactDto, ContactHistory, ContactCriteria, ContactHistoryCriteria, ContactAdminService, ContactConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all contacts")
    @GetMapping("")
    public ResponseEntity<List<ContactDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  contact")
    @PutMapping("")
    public ResponseEntity<ContactDto> update(@RequestBody ContactDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a contact by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ContactDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  contact")
    @PostMapping("")
    public ResponseEntity<ContactDto> save(@RequestBody ContactDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of contact")
    @PostMapping("multiple")
    public ResponseEntity<List<ContactDto>> delete(@RequestBody List<ContactDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified contact")
    @DeleteMapping("")
    public ResponseEntity<ContactDto> delete(@RequestBody ContactDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified contact")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple contacts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }
    @ApiOperation("Finds contacts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ContactDto>> findByCriteria(@RequestBody ContactCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated contacts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ContactCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports contacts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ContactCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets contact data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ContactCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets contact history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets contact paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ContactHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports contact history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ContactHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets contact history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ContactHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ContactRestAdmin (ContactAdminService service, ContactConverter converter) {
        super(service, converter);
    }


}