package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.History;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class HistoryController {
    @Autowired
    @Qualifier("userServiceImpl")
    private HistoryService service;

    @PostMapping("/create")
    @ResponseBody
    public History create(History student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public History update(History student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public History read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<History> getAll() {
        return service.getAll();
    }
}
