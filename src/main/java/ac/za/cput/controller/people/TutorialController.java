package ac.za.cput.controller.people;

import ac.za.cput.domain.people.Student;
import ac.za.cput.domain.people.Tutorial;
import ac.za.cput.service.StudentService;
import ac.za.cput.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class TutorialController {
    @Autowired
    @Qualifier("userServiceImpl")
    private TutorialService service;

    @PostMapping("/create")
    @ResponseBody
    public Tutorial create(Tutorial student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Tutorial update(Tutorial student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Tutorial read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Tutorial> getAll() {
        return service.getAll();
    }
}
