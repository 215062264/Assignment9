package ac.za.cput.service.impl;

import ac.za.cput.domain.schoolSubjects.Subject;
import ac.za.cput.repository.SubjectRepository;
import ac.za.cput.repository.impl.SubjectRepositoryImpl;
import ac.za.cput.service.SubjectService;

import java.util.Set;

public class SubjectServiceImpl implements SubjectService {

    private SubjectServiceImpl service = null;
    private SubjectRepository repository;

    private SubjectServiceImpl(){
        this.repository = SubjectRepositoryImpl.getRepository();
    }

    public SubjectService getService(){
        if (service == null) service = new SubjectServiceImpl();
        return service;
    }


    @Override
    public Subject create(Subject course) {
        return this.repository.create(course);
    }

    @Override
    public Subject update(Subject course) { return this.repository.update(course); }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Subject read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Subject> getAllP() {
        Set<Subject> subjects = getAll();

        return null;
    }

    @Override
    public Set<Subject> getAll() {
        return this.repository.getAll();
    }
}
