package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.ConsumerStudies;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.ConsumerStudiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

public class ConsumerStudiesController {
    @Autowired
    @Qualifier("userServiceImpl")
    private ConsumerStudiesService service;

    @PostMapping("/create")
    @ResponseBody
    public ConsumerStudies create(ConsumerStudies student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public ConsumerStudies update(ConsumerStudies student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ConsumerStudies read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ConsumerStudies> getAll() {
        return service.getAll();
    }
}
