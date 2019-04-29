package ac.za.cput.repository.impl;

import ac.za.cput.Domain.English;
import ac.za.cput.repository.EnglishRepository;
import java.util.HashSet;
import java.util.Set;

public class EnglishRepositoryImpl implements EnglishRepository{

    private static EnglishRepositoryImpl repository = null;
    private Set<English> englishes;

    private EnglishRepositoryImpl() {
        this.englishes = new HashSet<>();
    }

    public static EnglishRepository getRepository(){
        if(repository == null) repository = new EnglishRepositoryImpl();
        return repository;
    }

    public English create(English englishes){
        this.englishes.add(englishes);
        return englishes;
    }

    public English read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public English update(English englishes) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<English> getAll(){
        return this.englishes;
    }


}
