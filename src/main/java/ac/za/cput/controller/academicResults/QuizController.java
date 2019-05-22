package ac.za.cput.controller.academicResults;

import ac.za.cput.domain.academicResults.Quiz;
import ac.za.cput.domain.people.Lecture;
import ac.za.cput.service.LectureService;
import ac.za.cput.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class QuizController {
    @Autowired
    @Qualifier("userServiceImpl")
    private QuizService service;

    @PostMapping("/create")
    @ResponseBody
    public Quiz create(Quiz student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Quiz update(Quiz student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Quiz read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Quiz> getAll() {
        return service.getAll();
    }
}
