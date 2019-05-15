package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.InformationTech;
import ac.za.cput.repository.InformationTechRepository;
import ac.za.cput.repository.impl.InformationTechRepositoryImpl;
import ac.za.cput.service.InformationTechService;

import java.util.Set;

public class InformationTechServiceImpl implements InformationTechService {

    private InformationTechServiceImpl service = null;
    private InformationTechRepository repository;

    private InformationTechServiceImpl(){
        this.repository = InformationTechRepositoryImpl.getRepository();
    }

    public InformationTechService getService(){
        if (service == null) service = new InformationTechServiceImpl();
        return service;
    }


    @Override
    public InformationTech create(InformationTech course) {
        return this.repository.create(course);
    }

    @Override
    public InformationTech update(InformationTech course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public InformationTech read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<InformationTech> getAllIt() {
        Set<InformationTech> informationTechSet = getAll();

        return null;
    }

    @Override
    public Set<InformationTech> getAll() {
        return this.repository.getAll();
    }
}
