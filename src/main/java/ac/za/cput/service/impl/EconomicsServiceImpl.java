package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Economics;
import ac.za.cput.repository.EconomicsRepository;
import ac.za.cput.repository.impl.EconomicsRepositoryImpl;
import ac.za.cput.service.EconomicsService;

import java.util.Set;

public class EconomicsServiceImpl implements EconomicsService {

    private EconomicsServiceImpl service = null;
    private EconomicsRepository repository;

    private EconomicsServiceImpl(){
        this.repository = EconomicsRepositoryImpl.getRepository();
    }

    public EconomicsService getService(){
        if (service == null) service = new EconomicsServiceImpl();
        return service;
    }


    @Override
    public Economics create(Economics course) {
        return this.repository.create(course);
    }

    @Override
    public Economics update(Economics course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Economics read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Economics> getAllCivil() {
        Set<Economics> economics = getAll();

        return null;
    }

    @Override
    public Set<Economics> getAll() {
        return this.repository.getAll();
    }
}
