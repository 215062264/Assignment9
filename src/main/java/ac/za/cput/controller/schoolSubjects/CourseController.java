package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.Course;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class CourseController {
    @Autowired
    @Qualifier("userServiceImpl")
    private CourseService service;

    @PostMapping("/create")
    @ResponseBody
    public Course create(Course student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Course update(Course student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Course read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Course> getAll() {
        return service.getAll();
    }
}
