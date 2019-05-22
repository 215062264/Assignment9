package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.Physics;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.PhysicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class PhysicsController {
    @Autowired
    @Qualifier("userServiceImpl")
    private PhysicsService service;

    @PostMapping("/create")
    @ResponseBody
    public Physics create(Physics student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Physics update(Physics student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Physics read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Physics> getAll() {
        return service.getAll();
    }
}
