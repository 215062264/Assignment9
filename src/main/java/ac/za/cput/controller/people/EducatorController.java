package ac.za.cput.controller.people;

import ac.za.cput.domain.people.Educator;
import ac.za.cput.domain.people.Student;
import ac.za.cput.service.EducatorService;
import ac.za.cput.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class EducatorController {
    @Autowired
    @Qualifier("userServiceImpl")
    private EducatorService service;

    @PostMapping("/create")
    @ResponseBody
    public Educator create(Educator student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Educator update(Educator student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Educator read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Educator> getAll() {
        return service.getAll();
    }
}
