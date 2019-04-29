package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Educator;
import ac.za.cput.repository.EducatorRepository;
import java.util.HashSet;
import java.util.Set;

public class EducatorRepositoryImpl implements EducatorRepository {

    private static EducatorRepositoryImpl repository = null;
    private Set<Educator> educators;

    private EducatorRepositoryImpl() {
        this.educators = new HashSet<>();
    }

    public static EducatorRepository getRepository(){
        if(repository == null) repository = new EducatorRepositoryImpl();
        return repository;
    }

    public Educator create(Educator educators){
        this.educators.add(educators);
        return educators;
    }

    public Educator read(String educatorId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Educator update(Educator educator) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String educatorId) {
        //find the student and delete it if it exists

    }

    public Set<Educator> getAll(){
        return this.educators;
    }

}
