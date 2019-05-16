package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Registration;
import ac.za.cput.repository.RegistrationRepository;
import ac.za.cput.repository.impl.RegistrationRepositoryImpl;
import ac.za.cput.service.RegistrationService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class RegistrationServiceImpl implements RegistrationService {

    private RegistrationServiceImpl service = null;
    private RegistrationRepository repository;

    private RegistrationServiceImpl(){
        this.repository = RegistrationRepositoryImpl.getRepository();
    }

    public RegistrationService getService(){
        if (service == null) service = new RegistrationServiceImpl();
        return service;
    }


    @Override
    public Registration create(Registration course) {
        return this.repository.create(course);
    }

    @Override
    public Registration update(Registration course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Registration read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Registration> getAllP() {
        Set<Registration> registrations = getAll();

        return null;
    }

    @Override
    public Set<Registration> getAll() {
        return this.repository.getAll();
    }
}
