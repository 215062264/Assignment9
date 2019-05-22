package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.BusinessStudiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class BusinessStudiesController {
    @Autowired
    @Qualifier("userServiceImpl")
    private BusinessStudiesService service;

    @PostMapping("/create")
    @ResponseBody
    public BusinessStudies create(BusinessStudies student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public BusinessStudies update(BusinessStudies student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public BusinessStudies read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<BusinessStudies> getAll() {
        return service.getAll();
    }
}
