package ac.za.cput.repository.impl;

import ac.za.cput.Domain.BusinessStudies;
import ac.za.cput.repository.BusinessStudiesRepository;
import java.util.HashSet;
import java.util.Set;

public class BusinessStudiesRepositoryImpl implements BusinessStudiesRepository {

    private static BusinessStudiesRepositoryImpl repository = null;
    private Set<BusinessStudies> businessStudies;

    private BusinessStudiesRepositoryImpl() {
        this.businessStudies = new HashSet<>();
    }

    public static BusinessStudiesRepository getRepository(){
        if(repository == null) repository = new BusinessStudiesRepositoryImpl();
        return repository;
    }

    public BusinessStudies create(BusinessStudies businessStudies){
        this.businessStudies.add(businessStudies);
        return businessStudies;
    }

    public BusinessStudies read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public BusinessStudies update(BusinessStudies businessStudies) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<BusinessStudies> getAll(){
        return this.businessStudies;
    }


}
