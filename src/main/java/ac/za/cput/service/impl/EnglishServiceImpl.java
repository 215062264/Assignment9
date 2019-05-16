package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.English;
import ac.za.cput.repository.EnglishRepository;
import ac.za.cput.repository.impl.EnglishRepositoryImpl;
import ac.za.cput.service.EnglishService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class EnglishServiceImpl implements EnglishService {

    private EnglishServiceImpl service = null;
    private EnglishRepository repository;

    private EnglishServiceImpl(){
        this.repository = EnglishRepositoryImpl.getRepository();
    }

    public EnglishService getService(){
        if (service == null) service = new EnglishServiceImpl();
        return service;
    }


    @Override
    public English create(English course) {
        return this.repository.create(course);
    }

    @Override
    public English update(English course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public English read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<English> getAllEng() {
        Set<English> englishes = getAll();

        return null;
    }

    @Override
    public Set<English> getAll() {
        return this.repository.getAll();
    }
}
