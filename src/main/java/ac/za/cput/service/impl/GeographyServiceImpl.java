package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Geography;
import ac.za.cput.repository.GeographyRepository;
import ac.za.cput.repository.impl.GeographyRepositoryImpl;
import ac.za.cput.service.GeographyService;

import java.util.Set;

public class GeographyServiceImpl implements GeographyService {

    private GeographyServiceImpl service = null;
    private GeographyRepository repository;

    private GeographyServiceImpl(){
        this.repository = GeographyRepositoryImpl.getRepository();
    }

    public GeographyService getService(){
        if (service == null) service = new GeographyServiceImpl();
        return service;
    }


    @Override
    public Geography create(Geography course) {
        return this.repository.create(course);
    }

    @Override
    public Geography update(Geography course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Geography read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Geography> getAllGeo() {
        Set<Geography> geographies = getAll();

        return null;
    }

    @Override
    public Set<Geography> getAll() {
        return this.repository.getAll();
    }
}
