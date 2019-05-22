package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.Geography;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.GeographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class GeographyController {
    @Autowired
    @Qualifier("userServiceImpl")
    private GeographyService service;

    @PostMapping("/create")
    @ResponseBody
    public Geography create(Geography student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Geography update(Geography student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Geography read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Geography> getAll() {
        return service.getAll();
    }
}
