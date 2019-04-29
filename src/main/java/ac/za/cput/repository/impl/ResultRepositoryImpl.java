package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Results;
import ac.za.cput.repository.ResultRepository;
import java.util.HashSet;
import java.util.Set;

public class ResultRepositoryImpl implements ResultRepository {

    private static ResultRepositoryImpl repository = null;
    private Set<Results> results;

    private ResultRepositoryImpl() {
        this.results = new HashSet<>();
    }

    public static ResultRepository getRepository(){
        if(repository == null) repository = new ResultRepositoryImpl();
        return repository;
    }

    public Results create(Results results){
        this.results.add(results);
        return results;
    }

    public Results read(String studentNum){
        //find the student in the set and return it if it exist
        return null;
    }

    public Results update(Results results) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentNum) {
        //find the student and delete it if it exists

    }

    public Set<Results> getAll(){
        return this.results;
    }

}
