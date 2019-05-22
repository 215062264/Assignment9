package ac.za.cput.controller.schoolSubjects;

import ac.za.cput.domain.schoolSubjects.Accounting;
import ac.za.cput.domain.schoolSubjects.CivilEngineering;
import ac.za.cput.service.AccountingService;
import ac.za.cput.service.CivilEngineeringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@RestController
@RequestMapping("/student")
public class CivilEngineeringController {
    @Autowired
    @Qualifier("userServiceImpl")
    private CivilEngineeringService service;

    @PostMapping("/create")
    @ResponseBody
    public CivilEngineering create(CivilEngineering student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public CivilEngineering update(CivilEngineering student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public CivilEngineering read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<CivilEngineering> getAll() {
        return service.getAll();
    }
}
