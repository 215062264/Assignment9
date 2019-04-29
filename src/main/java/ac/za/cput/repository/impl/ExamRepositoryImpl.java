package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Exam;
import ac.za.cput.repository.ExamRepository;
import java.util.HashSet;
import java.util.Set;

public class ExamRepositoryImpl implements ExamRepository {

    private static ExamRepositoryImpl repository = null;
    private Set<Exam> exams;

    private ExamRepositoryImpl() {
        this.exams = new HashSet<>();
    }

    public static ExamRepository getRepository(){
        if(repository == null) repository = new ExamRepositoryImpl();
        return repository;
    }

    public Exam create(Exam exams){
        this.exams.add(exams);
        return exams;
    }

    public Exam read(String subjectCode){
        //find the student in the set and return it if it exist
        return null;
    }

    public Exam update(Exam exams) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String subjectCode) {
        //find the student and delete it if it exists

    }

    public Set<Exam> getAll(){
        return this.exams;
    }

}
