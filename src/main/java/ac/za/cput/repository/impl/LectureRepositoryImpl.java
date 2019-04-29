package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Lecture;
import ac.za.cput.repository.LectureRepository;
import java.util.HashSet;
import java.util.Set;

public class LectureRepositoryImpl implements LectureRepository {

    private static LectureRepositoryImpl repository = null;
    private Set<Lecture> lectures;

    private LectureRepositoryImpl() {
        this.lectures = new HashSet<>();
    }

    public static LectureRepository getRepository(){
        if(repository == null) repository = new LectureRepositoryImpl();
        return repository;
    }

    public Lecture create(Lecture lectures){
        this.lectures.add(lectures);
        return lectures;
    }

    public Lecture read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Lecture update(Lecture lectures) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Lecture> getAll(){
        return this.lectures;
    }

}
