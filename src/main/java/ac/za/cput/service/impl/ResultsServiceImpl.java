package ac.za.cput.service.impl;

import ac.za.cput.domain.academicResults.Results;
import ac.za.cput.repository.ResultRepository;
import ac.za.cput.repository.impl.ResultRepositoryImpl;
import ac.za.cput.service.ResultsService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ResultsServiceImpl implements ResultsService {

    private ResultsServiceImpl service = null;
    private ResultRepository repository;

    private ResultsServiceImpl(){
        this.repository = ResultRepositoryImpl.getRepository();
    }

    public ResultsService getService(){
        if (service == null) service = new ResultsServiceImpl();
        return service;
    }


    @Override
    public Results create(Results educator) {
        return this.repository.create(educator);
    }

    @Override
    public Results update(Results educator) {
        return this.repository.update(educator);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Results read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Results> getAllP() {
        Set<Results> results = getAll();

        return null;
    }

    @Override
    public Set<Results> getAll() {
        return this.repository.getAll();
    }
}
