package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.BusinessStudies;
import ac.za.cput.repository.BusinessStudiesRepository;
import ac.za.cput.repository.impl.BusinessStudiesRepositoryImpl;
import ac.za.cput.service.BusinessStudiesService;

import java.util.Set;

public class BusinessStudiesServiceImpl implements BusinessStudiesService {

    private BusinessStudiesServiceImpl service = null;
    private BusinessStudiesRepository repository;

    private BusinessStudiesServiceImpl(){
        this.repository = BusinessStudiesRepositoryImpl.getRepository();
    }

    public BusinessStudiesService getService(){
        if (service == null) service = new BusinessStudiesServiceImpl();
        return service;
    }


    @Override
    public BusinessStudies create(BusinessStudies course) {
        return this.repository.create(course);
    }

    @Override
    public BusinessStudies update(BusinessStudies course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public BusinessStudies read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<BusinessStudies> getAllBusiness() {
        Set<BusinessStudies> businessStudies = getAll();

        return null;
    }

    @Override
    public Set<BusinessStudies> getAll() {
        return this.repository.getAll();
    }
}
