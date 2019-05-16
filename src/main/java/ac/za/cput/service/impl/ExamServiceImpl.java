package ac.za.cput.service.impl;

import ac.za.cput.domain.academicResults.Exam;
import ac.za.cput.repository.ExamRepository;
import ac.za.cput.repository.impl.ExamRepositoryImpl;
import ac.za.cput.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ExamServiceImpl implements ExamService {

    private ExamServiceImpl service = null;
    private ExamRepository repository;

    private ExamServiceImpl(){
        this.repository = ExamRepositoryImpl.getRepository();
    }

    public ExamService getService(){
        if (service == null) service = new ExamServiceImpl();
        return service;
    }


    @Override
    public Exam create(Exam educator) {
        return this.repository.create(educator);
    }

    @Override
    public Exam update(Exam educator) {
        return this.repository.update(educator);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Exam read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Exam> getAllA() {
        Set<Exam> exams = getAll();

        return null;
    }

    @Override
    public Set<Exam> getAll() {
        return this.repository.getAll();
    }
}
