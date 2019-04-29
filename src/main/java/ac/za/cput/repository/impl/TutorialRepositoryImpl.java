package ac.za.cput.repository.impl;


import ac.za.cput.Domain.Tutorial;
import ac.za.cput.repository.TutorialRepository;
import java.util.HashSet;
import java.util.Set;

public class TutorialRepositoryImpl implements TutorialRepository {

    private static TutorialRepositoryImpl repository = null;
    private Set<Tutorial> tutorials;

    private TutorialRepositoryImpl() {
        this.tutorials = new HashSet<>();
    }

    public static TutorialRepository getRepository(){
        if(repository == null) repository = new TutorialRepositoryImpl();
        return repository;
    }

    public Tutorial create(Tutorial tutorials){
        this.tutorials.add(tutorials);
        return tutorials;
    }

    public Tutorial read(String tutorId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Tutorial update(Tutorial tutorials) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String tutorId) {
        //find the student and delete it if it exists

    }

    public Set<Tutorial> getAll(){
        return this.tutorials;
    }

}
