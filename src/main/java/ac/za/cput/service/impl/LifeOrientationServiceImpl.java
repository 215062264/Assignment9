package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.LifeOrientation;
import ac.za.cput.repository.LifeOrientationRepository;
import ac.za.cput.repository.impl.LifeOrientationRepositoryImpl;
import ac.za.cput.service.LifeOrientationService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class LifeOrientationServiceImpl implements LifeOrientationService {

    private LifeOrientationServiceImpl service = null;
    private LifeOrientationRepository repository;

    private LifeOrientationServiceImpl(){
        this.repository = LifeOrientationRepositoryImpl.getRepository();
    }

    public LifeOrientationService getService(){
        if (service == null) service = new LifeOrientationServiceImpl();
        return service;
    }


    @Override
    public LifeOrientation create(LifeOrientation course) {
        return this.repository.create(course);
    }

    @Override
    public LifeOrientation update(LifeOrientation course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public LifeOrientation read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<LifeOrientation> getAllLO() {
        Set<LifeOrientation> lifeOrientations = getAll();

        return null;
    }

    @Override
    public Set<LifeOrientation> getAll() {
        return this.repository.getAll();
    }
}
