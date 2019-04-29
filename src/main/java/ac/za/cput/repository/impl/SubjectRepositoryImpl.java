package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Subject;
import ac.za.cput.repository.SubjectRepository;
import java.util.HashSet;
import java.util.Set;

public class SubjectRepositoryImpl implements SubjectRepository{

    private static SubjectRepositoryImpl repository = null;
    private Set<Subject> subjects;

    private SubjectRepositoryImpl() {
        this.subjects = new HashSet<>();
    }

    public static SubjectRepository getRepository(){
        if(repository == null) repository = new SubjectRepositoryImpl();
        return repository;
    }

    public Subject create(Subject subjects){
        this.subjects.add(subjects);
        return subjects;
    }

    public Subject read(String subjectId){
        //find the student in the set and return it if it exist
        return null;
    }

    public Subject update(Subject subjects) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectId) {
        //find the student and delete it if it exists

    }

    public Set<Subject> getAll(){
        return this.subjects;
    }

}
