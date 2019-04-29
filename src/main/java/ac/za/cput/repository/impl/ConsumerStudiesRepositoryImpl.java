package ac.za.cput.repository.impl;

import ac.za.cput.Domain.ConsumerStudies;
import ac.za.cput.repository.ConsumerStudiesRepository;
import java.util.HashSet;
import java.util.Set;

public class ConsumerStudiesRepositoryImpl implements ConsumerStudiesRepository {

    private static ConsumerStudiesRepositoryImpl repository = null;
    private Set<ConsumerStudies> consumerStudies;

    private ConsumerStudiesRepositoryImpl() {
        this.consumerStudies = new HashSet<>();
    }

    public static ConsumerStudiesRepository getRepository(){
        if(repository == null) repository = new ConsumerStudiesRepositoryImpl();
        return repository;
    }

    public ConsumerStudies create(ConsumerStudies consumerStudies){
        this.consumerStudies.add(consumerStudies);
        return consumerStudies;
    }

    public ConsumerStudies read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public ConsumerStudies update(ConsumerStudies consumerStudies) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<ConsumerStudies> getAll(){
        return this.consumerStudies;
    }


}
