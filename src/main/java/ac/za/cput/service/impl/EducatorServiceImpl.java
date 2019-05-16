package ac.za.cput.service.impl;

import ac.za.cput.domain.people.Educator;
import ac.za.cput.repository.EducatorRepository;
import ac.za.cput.repository.impl.EducatorRepositoryImpl;
import ac.za.cput.service.EducatorService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EducatorServiceImpl implements EducatorService {

    private EducatorServiceImpl service = null;
    private EducatorRepository repository;

    private EducatorServiceImpl(){
        this.repository = EducatorRepositoryImpl.getRepository();
    }

    public EducatorService getService(){
        if (service == null) service = new EducatorServiceImpl();
        return service;
    }


    @Override
    public Educator create(Educator educator) {
        return this.repository.create(educator);
    }

    @Override
    public Educator update(Educator educator) {
        return this.repository.update(educator);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Educator read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Educator> getAllEducators() {
        Set<Educator> educators = getAll();

        return null;
    }

    @Override
    public Set<Educator> getAll() {
        return this.repository.getAll();
    }
}
