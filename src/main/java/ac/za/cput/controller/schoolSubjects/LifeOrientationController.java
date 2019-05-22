package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.LifeOrientation;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.LifeOrientationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class LifeOrientationController {
    @Autowired
    @Qualifier("userServiceImpl")
    private LifeOrientationService service;

    @PostMapping("/create")
    @ResponseBody
    public LifeOrientation create(LifeOrientation student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public LifeOrientation update(LifeOrientation student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public LifeOrientation read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<LifeOrientation> getAll() {
        return service.getAll();
    }
}
