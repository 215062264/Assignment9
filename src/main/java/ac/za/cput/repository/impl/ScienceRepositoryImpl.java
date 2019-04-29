package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Science;
import ac.za.cput.repository.ScienceRepository;
import java.util.HashSet;
import java.util.Set;

public class ScienceRepositoryImpl implements ScienceRepository {

    private static ScienceRepositoryImpl repository = null;
    private Set<Science> sciences;

    private ScienceRepositoryImpl() {
        this.sciences = new HashSet<>();
    }

    public static ScienceRepository getRepository(){
        if(repository == null) repository = new ScienceRepositoryImpl();
        return repository;
    }

    public Science create(Science sciences){
        this.sciences.add(sciences);
        return sciences;
    }

    public Science read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Science update(Science science) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Science> getAll(){
        return this.sciences;
    }


}
