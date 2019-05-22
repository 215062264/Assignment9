package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.Economics;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.EconomicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class EconomicsController {
    @Autowired
    @Qualifier("userServiceImpl")
    private EconomicsService service;

    @PostMapping("/create")
    @ResponseBody
    public Economics create(Economics student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Economics update(Economics student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Economics read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Economics> getAll() {
        return service.getAll();
    }
}
