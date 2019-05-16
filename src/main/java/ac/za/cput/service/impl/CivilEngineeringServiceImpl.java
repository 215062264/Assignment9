package ac.za.cput.service.impl;


import ac.za.cput.domain.schoolSubjects.CivilEngineering;
import ac.za.cput.repository.CivilEngineeringRepository;
import ac.za.cput.repository.impl.CivilEngineeringRepositoryImpl;
import ac.za.cput.service.CivilEngineeringService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class CivilEngineeringServiceImpl implements CivilEngineeringService {

    private CivilEngineeringServiceImpl service = null;
    private CivilEngineeringRepository repository;

    private CivilEngineeringServiceImpl(){
        this.repository = CivilEngineeringRepositoryImpl.getRepository();
    }

    public CivilEngineeringService getService(){
        if (service == null) service = new CivilEngineeringServiceImpl();
        return service;
    }


    @Override
    public CivilEngineering create(CivilEngineering course) {
        return this.repository.create(course);
    }

    @Override
    public CivilEngineering update(CivilEngineering course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public CivilEngineering read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<CivilEngineering> getAllCivil() {
        Set<CivilEngineering> civilEngineerings = getAll();

        return null;
    }

    @Override
    public Set<CivilEngineering> getAll() {
        return this.repository.getAll();
    }
}
