package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.English;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.EnglishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class EnglishController {
    @Autowired
    @Qualifier("userServiceImpl")
    private EnglishService service;

    @PostMapping("/create")
    @ResponseBody
    public English create(English student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public English update(English student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public English read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<English> getAll() {
        return service.getAll();
    }
}
