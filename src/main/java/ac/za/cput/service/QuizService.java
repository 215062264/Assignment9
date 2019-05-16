package ac.za.cput.service;

import ac.za.cput.domain.academicResults.Quiz;

import java.util.Set;

public interface QuizService extends IService<Quiz,String> {
    Set<Quiz> getAllP();
    Set<Quiz> getAll();
}
