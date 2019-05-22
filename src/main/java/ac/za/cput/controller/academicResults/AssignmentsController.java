package ac.za.cput.controller.academicResults;

import ac.za.cput.domain.academicResults.Assignments;
import ac.za.cput.domain.people.Lecture;
import ac.za.cput.service.AssignmentsService;
import ac.za.cput.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class AssignmentsController {
    @Autowired
    @Qualifier("userServiceImpl")
    private AssignmentsService service;

    @PostMapping("/create")
    @ResponseBody
    public Assignments create(Assignments student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Assignments update(Assignments student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Assignments read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Assignments> getAll() {
        return service.getAll();
    }
}
