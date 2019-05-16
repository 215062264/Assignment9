package ac.za.cput.service.impl;

import ac.za.cput.domain.people.Lecture;
import ac.za.cput.repository.LectureRepository;
import ac.za.cput.repository.impl.LectureRepositoryImpl;
import ac.za.cput.service.LectureService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class LectureServiceImpl implements LectureService {

    private LectureServiceImpl service = null;
    private LectureRepository repository;

    private LectureServiceImpl(){
        this.repository = LectureRepositoryImpl.getRepository();
    }

    public LectureService getService(){
        if (service == null) service = new LectureServiceImpl();
        return service;
    }


    @Override
    public Lecture create(Lecture lecture) {
        return this.repository.create(lecture);
    }

    @Override
    public Lecture update(Lecture lecture) {
        return this.repository.update(lecture);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Lecture read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Lecture> getAllLO() {
        Set<Lecture> lectures = getAll();

        return null;
    }

    @Override
    public Set<Lecture> getAll() {
        return this.repository.getAll();
    }
}
