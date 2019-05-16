package ac.za.cput.service.impl;

import ac.za.cput.domain.academicResults.Assignments;
import ac.za.cput.repository.AssignmentsRepository;
import ac.za.cput.repository.impl.AssignmentsRepositoryImpl;
import ac.za.cput.service.AssignmentsService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class AssignmentsServiceImpl implements AssignmentsService {

    private AssignmentsServiceImpl service = null;
    private AssignmentsRepository repository;

    private AssignmentsServiceImpl(){
        this.repository = AssignmentsRepositoryImpl.getRepository();
    }

    public AssignmentsService getService(){
        if (service == null) service = new AssignmentsServiceImpl();
        return service;
    }


    @Override
    public Assignments create(Assignments educator) {
        return this.repository.create(educator);
    }

    @Override
    public Assignments update(Assignments educator) {
        return this.repository.update(educator);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Assignments read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Assignments> getAllA() {
        Set<Assignments> assignments = getAll();

        return null;
    }

    @Override
    public Set<Assignments> getAll() {
        return this.repository.getAll();
    }
}
