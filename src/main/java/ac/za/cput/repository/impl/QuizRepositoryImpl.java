package ac.za.cput.repository.impl;

import ac.za.cput.Domain.Quiz;
import ac.za.cput.repository.QuizRepository;
import java.util.HashSet;
import java.util.Set;

public class QuizRepositoryImpl implements QuizRepository {


    private static QuizRepositoryImpl repository = null;
    private Set<Quiz> quizzes;

    private QuizRepositoryImpl() {
        this.quizzes = new HashSet<>();
    }

    public static QuizRepository getRepository(){
        if(repository == null) repository = new QuizRepositoryImpl();
        return repository;
    }

    public Quiz create(Quiz quizzes){
        this.quizzes.add(quizzes);
        return quizzes;
    }

    public Quiz read(String studentNum){
        //find the student in the set and return it if it exist
        return null;
    }

    public Quiz update(Quiz quizzes) {
        // find the student, update it and return the updated student
        return null;
    }

    public void delete(String studentNum) {
        //find the student and delete it if it exists

    }

    public Set<Quiz> getAll(){
        return this.quizzes;
    }

}
