package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class AccountingController {
    @Autowired
    @Qualifier("userServiceImpl")
    private AccountingService service;

    @PostMapping("/create")
    @ResponseBody
    public Accounting create(Accounting student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Accounting update(Accounting student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Accounting read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Accounting> getAll() {
        return service.getAll();
    }
}
