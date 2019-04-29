package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Economics;
import ac.za.cput.repository.EconomicsRepository;
import java.util.HashSet;
import java.util.Set;

public class EconomicsRepositoryImpl implements EconomicsRepository {

    private static EconomicsRepositoryImpl repository = null;
    private Set<Economics> economics;

    private EconomicsRepositoryImpl() {
        this.economics = new HashSet<>();
    }

    public static EconomicsRepository getRepository(){
        if(repository == null) repository = new EconomicsRepositoryImpl();
        return repository;
    }

    public Economics create(Economics economics){
        this.economics.add(economics);
        return economics;
    }

    public Economics read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Economics update(Economics economics) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Economics> getAll(){
        return this.economics;
    }


}
