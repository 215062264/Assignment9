package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import ac.za.cput.domain.schoolSubjects.Registration;
import ac.za.cput.service.BusinessStudiesService;
import ac.za.cput.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/student")
public class RegistrationController {
    @Autowired
    @Qualifier("userServiceImpl")
    private RegistrationService service;

    @PostMapping("/create")
    @ResponseBody
    public Registration create(Registration student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Registration update(Registration student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Registration read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Registration> getAll() {
        return service.getAll();
    }
}
