package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Physics;
import ac.za.cput.repository.PhysicsRepository;
import ac.za.cput.repository.impl.PhysicsRepositoryImpl;
import ac.za.cput.service.PhysicsService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PhysicsServiceImpl implements PhysicsService {

    private PhysicsServiceImpl service = null;
    private PhysicsRepository repository;

    private PhysicsServiceImpl(){
        this.repository = PhysicsRepositoryImpl.getRepository();
    }

    public PhysicsService getService(){
        if (service == null) service = new PhysicsServiceImpl();
        return service;
    }


    @Override
    public Physics create(Physics course) {
        return this.repository.create(course);
    }

    @Override
    public Physics update(Physics course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Physics read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Physics> getAllP() {
        Set<Physics> physics = getAll();

        return null;
    }

    @Override
    public Set<Physics> getAll() {
        return this.repository.getAll();
    }
}
