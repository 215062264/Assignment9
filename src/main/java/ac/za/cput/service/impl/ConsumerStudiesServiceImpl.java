package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.ConsumerStudies;
import ac.za.cput.repository.ConsumerStudiesRepository;
import ac.za.cput.repository.impl.ConsumerStudiesRepositoryImpl;
import ac.za.cput.service.ConsumerStudiesService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ConsumerStudiesServiceImpl implements ConsumerStudiesService {

    private ConsumerStudiesServiceImpl service = null;
    private ConsumerStudiesRepository repository;

    private ConsumerStudiesServiceImpl(){
        this.repository = ConsumerStudiesRepositoryImpl.getRepository();
    }

    public ConsumerStudiesService getService(){
        if (service == null) service = new ConsumerStudiesServiceImpl();
        return service;
    }


    @Override
    public ConsumerStudies create(ConsumerStudies course) {
        return this.repository.create(course);
    }

    @Override
    public ConsumerStudies update(ConsumerStudies course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public ConsumerStudies read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<ConsumerStudies> getAllCivil() {
        Set<ConsumerStudies> consumerStudies = getAll();

        return null;
    }

    @Override
    public Set<ConsumerStudies> getAll() {
        return this.repository.getAll();
    }
}
