package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Science;
import ac.za.cput.repository.ScienceRepository;
import ac.za.cput.repository.impl.ScienceRepositoryImpl;
import ac.za.cput.service.ScienceService;

import java.util.Set;

public class ScienceServiceImpl implements ScienceService {

    private ScienceServiceImpl service = null;
    private ScienceRepository repository;

    private ScienceServiceImpl(){
        this.repository = ScienceRepositoryImpl.getRepository();
    }

    public ScienceService getService(){
        if (service == null) service = new ScienceServiceImpl();
        return service;
    }


    @Override
    public Science create(Science course) {
        return this.repository.create(course);
    }

    @Override
    public Science update(Science course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Science read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Science> getAllP() {
        Set<Science> sciences = getAll();

        return null;
    }

    @Override
    public Set<Science> getAll() {
        return this.repository.getAll();
    }
}
