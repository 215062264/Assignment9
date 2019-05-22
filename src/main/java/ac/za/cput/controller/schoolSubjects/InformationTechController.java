package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.InformationTech;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.InformationTechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class InformationTechController {
    @Autowired
    @Qualifier("userServiceImpl")
    private InformationTechService service;

    @PostMapping("/create")
    @ResponseBody
    public InformationTech create(InformationTech student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public InformationTech update(InformationTech student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public InformationTech read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<InformationTech> getAll() {
        return service.getAll();
    }
}
