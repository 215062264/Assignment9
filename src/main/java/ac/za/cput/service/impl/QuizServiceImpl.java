package ac.za.cput.service.impl;

import ac.za.cput.domain.academicResults.Quiz;
import ac.za.cput.repository.QuizRepository;
import ac.za.cput.repository.impl.QuizRepositoryImpl;
import ac.za.cput.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class QuizServiceImpl implements QuizService {

    private QuizServiceImpl service = null;
    private QuizRepository repository;

    private QuizServiceImpl(){
        this.repository = QuizRepositoryImpl.getRepository();
    }

    public QuizService getService(){
        if (service == null) service = new QuizServiceImpl();
        return service;
    }


    @Override
    public Quiz create(Quiz educator) {
        return this.repository.create(educator);
    }

    @Override
    public Quiz update(Quiz educator) {
        return this.repository.update(educator);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Quiz read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Quiz> getAllP() {
        Set<Quiz> quizzes = getAll();

        return null;
    }

    @Override
    public Set<Quiz> getAll() {
        return this.repository.getAll();
    }
}
