package ac.za.cput.controller.people;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class LectureController {
    @Autowired
    @Qualifier("userServiceImpl")
    private LectureService service;

    @PostMapping("/create")
    @ResponseBody
    public Lecture create(Lecture student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Lecture update(Lecture student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Lecture read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Lecture> getAll() {
        return service.getAll();
    }
}
