package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.Mathematics;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.MathematicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class MathematicsController {
    @Autowired
    @Qualifier("userServiceImpl")
    private MathematicsService service;

    @PostMapping("/create")
    @ResponseBody
    public Mathematics create(Mathematics student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Mathematics update(Mathematics student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Mathematics read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Mathematics> getAll() {
        return service.getAll();
    }
}
