package ac.za.cput.controller.academicResults;

import ac.za.cput.domain.academicResults.Exam;
import ac.za.cput.domain.people.Lecture;
import ac.za.cput.service.ExamService;
import ac.za.cput.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class ExamController {
    @Autowired
    @Qualifier("userServiceImpl")
    private ExamService service;

    @PostMapping("/create")
    @ResponseBody
    public Exam create(Exam student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Exam update(Exam student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Exam read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Exam> getAll() {
        return service.getAll();
    }
}
