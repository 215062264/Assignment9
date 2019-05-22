package ac.za.cput.controller.academicResults;

import ac.za.cput.domain.academicResults.Results;
import ac.za.cput.domain.people.Lecture;
import ac.za.cput.service.LectureService;
import ac.za.cput.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class ResultsController {
    @Autowired
    @Qualifier("userServiceImpl")
    private ResultsService service;

    @PostMapping("/create")
    @ResponseBody
    public Results create(Results student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Results update(Results student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Results read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Results> getAll() {
        return service.getAll();
    }
}
